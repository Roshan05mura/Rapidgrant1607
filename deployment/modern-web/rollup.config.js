const {
    nodeResolve,
} = require("D:/Software/9.3.0.22930/modeler/tools/node/node_modules/@rollup/plugin-node-resolve");
const commonjs = require("D:/Software/9.3.0.22930/modeler/tools/node/node_modules/@rollup/plugin-commonjs");
const clear = require("D:/Software/9.3.0.22930/modeler/tools/node/node_modules/rollup-plugin-clear");
const esbuild = require("D:/Software/9.3.0.22930/modeler/tools/node/node_modules/rollup-plugin-esbuild");
const alias = require("D:/Software/9.3.0.22930/modeler/tools/node/node_modules/@rollup/plugin-alias");

export default {
    input: "index.js",
    watch: {
        clearScreen: false,
    },
    output: {
        dir: "dist",
        format: "es",
        chunkFileNames: "[name].js",
        sourcemap: true,
        // manualChunks(id) {
        //   if (id.includes("node_modules")) {
        //     return "commons";
        //   }
        // },
    },
    treeshake: {
        // commented for now, as rollup stripped mobx configuration from index.ts
        // moduleSideEffects: false,
    },
    plugins: [
        esbuild({
            // All options are optional
            sourceMap: true, // default
            exclude: [],
            minify: process.env.NODE_ENV === "production",
            // Like @rollup/plugin-replace
            define: {
                "process.env.NODE_ENV": JSON.stringify("development"),
            },
            loaders: {
                // Enable JSX in .js files too
                ".js": "jsx",
            },
        }),
        alias({
            entries: {
                react: "D:/Software/9.3.0.22930/modeler/tools/node/node_modules/react",
                "big.js": "D:/Software/9.3.0.22930/modeler/tools/node/node_modules/big.js",
                "mendix-web": "D:/Software/9.3.0.22930/modeler/tools/node/node_modules/mendix-web",
            },
            customResolver: nodeResolve(),
        }),
        nodeResolve(),
        commonjs({ transformMixedEsModules: true }),
        clear({
            targets: ["dist"],
            // watch: true,
        }),
    ],
};
