!function(t,e){if("object"==typeof exports&&"object"==typeof module)module.exports=e(require("react"),require("dojo/aspect"),require("dijit/registry"),require("dojo/_base/connect"));else if("function"==typeof define&&define.amd)define(["react","dojo/aspect","dijit/registry","dojo/_base/connect"],e);else{var r="object"==typeof exports?e(require("react"),require("dojo/aspect"),require("dijit/registry"),require("dojo/_base/connect")):e(t.react,t["dojo/aspect"],t["dijit/registry"],t["dojo/_base/connect"]);for(var i in r)("object"==typeof exports?exports:t)[i]=r[i]}}(window,(function(t,e,r,i){return function(t){var e={};function r(i){if(e[i])return e[i].exports;var o=e[i]={i:i,l:!1,exports:{}};return t[i].call(o.exports,o,o.exports,r),o.l=!0,o.exports}return r.m=t,r.c=e,r.d=function(t,e,i){r.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:i})},r.r=function(t){"undefined"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},r.t=function(t,e){if(1&e&&(t=r(t)),8&e)return t;if(4&e&&"object"==typeof t&&t&&t.__esModule)return t;var i=Object.create(null);if(r.r(i),Object.defineProperty(i,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var o in t)r.d(i,o,function(e){return t[e]}.bind(null,o));return i},r.n=function(t){var e=t&&t.__esModule?function(){return t.default}:function(){return t};return r.d(e,"a",e),e},r.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},r.p="/",r(r.s=21)}([function(e,r){e.exports=t},function(t,e,r){var i;
/*!
  Copyright (c) 2017 Jed Watson.
  Licensed under the MIT License (MIT), see
  http://jedwatson.github.io/classnames
*/!function(){"use strict";var r={}.hasOwnProperty;function o(){for(var t=[],e=0;e<arguments.length;e++){var i=arguments[e];if(i){var n=typeof i;if("string"===n||"number"===n)t.push(i);else if(Array.isArray(i)&&i.length){var a=o.apply(null,i);a&&t.push(a)}else if("object"===n)for(var s in i)r.call(i,s)&&i[s]&&t.push(s)}}return t.join(" ")}t.exports?(o.default=o,t.exports=o):void 0===(i=function(){return o}.apply(e,[]))||(t.exports=i)}()},function(t,e,r){var i;void 0===(i=function(t,e){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.SharedUtils=void 0;var r=function(){function t(){}return t.parseStyle=function(t){void 0===t&&(t="");try{return t.split(";").reduce((function(t,e){var r=e.split(":");2===r.length&&(t[r[0].trim().replace(/(-.)/g,(function(t){return t[1].toUpperCase()}))]=r[1].trim());return t}),{})}catch(e){window.console.log("Failed to parse style",t,e)}return{}},t.validateCompatibility=function(t){var e=t.listViewEntity,r=t.targetListView,i=r&&r.datasource&&r.datasource.type;if(!r){var o="This widget is unable to find a list view ";return o+=e?"with the supplied entity '"+e+"'":"to connect"}return i&&"database"!==i&&"xpath"!==i?"This widget is only compatible with list view data source type 'Database' and 'XPath'":r&&r._datasource&&r._entity&&r.update?r._entity&&void 0!==e&&e!==r._entity?'The supplied entity "'+t.listViewEntity+'" does not belong to list view data source':"":"This widget version is not compatible with this Mendix version"},t.findTargetNode=function(t){for(var e=null;!e&&t&&!((e=t.querySelectorAll(".mx-listview")[0])||t.isEqualNode(document)||!t.classList||t.classList.contains("mx-incubator")||t.classList.contains("mx-offscreen"));)t=t.parentNode;return e},t.delay=function(t,e,r){return void 0===r&&(r=500),setTimeout((function i(){e()?t():setTimeout(i,r)}),r)},t}();e.SharedUtils=r}.apply(e,[r,e]))||(t.exports=i)},function(t,e,r){var i,o;i=[r,e,r(8)],void 0===(o=function(t,e,r){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.SharedContainerUtils=void 0;var i=function(){function t(){}return t.findTargetListView=function(t,e){for(var i;t;){for(var o=t.querySelectorAll(".mx-listview"),n=0;n<o.length;n++){if((i=r.byNode(o.item(n)))&&!e)return i;if(i&&i._entity===e)return i}if(t.isEqualNode(document)||!t.classList||t.classList.contains("mx-incubator")||t.classList.contains("mx-offscreen"))break;t=t.parentNode}return i},t}();e.SharedContainerUtils=i}.apply(e,i))||(t.exports=o)},function(t,e,r){var i,o=this&&this.__assign||function(){return(o=Object.assign||function(t){for(var e,r=1,i=arguments.length;r<i;r++)for(var o in e=arguments[r])Object.prototype.hasOwnProperty.call(e,o)&&(t[o]=e[o]);return t}).apply(this,arguments)},n=this&&this.__awaiter||function(t,e,r,i){return new(r||(r=Promise))((function(o,n){function a(t){try{u(i.next(t))}catch(t){n(t)}}function s(t){try{u(i.throw(t))}catch(t){n(t)}}function u(t){var e;t.done?o(t.value):(e=t.value,e instanceof r?e:new r((function(t){t(e)}))).then(a,s)}u((i=i.apply(t,e||[])).next())}))},a=this&&this.__generator||function(t,e){var r,i,o,n,a={label:0,sent:function(){if(1&o[0])throw o[1];return o[1]},trys:[],ops:[]};return n={next:s(0),throw:s(1),return:s(2)},"function"==typeof Symbol&&(n[Symbol.iterator]=function(){return this}),n;function s(n){return function(s){return function(n){if(r)throw new TypeError("Generator is already executing.");for(;a;)try{if(r=1,i&&(o=2&n[0]?i.return:n[0]?i.throw||((o=i.return)&&o.call(i),0):i.next)&&!(o=o.call(i,n[1])).done)return o;switch(i=0,o&&(n=[2&n[0],o.value]),n[0]){case 0:case 1:o=n;break;case 4:return a.label++,{value:n[1],done:!1};case 5:a.label++,i=n[1],n=[0];continue;case 7:n=a.ops.pop(),a.trys.pop();continue;default:if(!(o=(o=a.trys).length>0&&o[o.length-1])&&(6===n[0]||2===n[0])){a=0;continue}if(3===n[0]&&(!o||n[1]>o[0]&&n[1]<o[3])){a.label=n[1];break}if(6===n[0]&&a.label<o[1]){a.label=o[1],o=n;break}if(o&&a.label<o[2]){a.label=o[2],a.ops.push(n);break}o[2]&&a.ops.pop(),a.trys.pop();continue}n=e.call(t,a)}catch(t){n=[6,t],i=0}finally{r=o=0}if(5&n[0])throw n[1];return{value:n[0]?n[1]:void 0,done:!0}}([n,s])}}};void 0===(i=function(t,e){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.getTranslations=e.mxTranslation=e.hideLoader=e.showLoader=e.setListNodeToEmpty=e.getListNode=e.persistListViewHeight=e.resetListViewHeight=e.showLoadMoreButton=e.hideLoadMoreButton=void 0,e.hideLoadMoreButton=function(t){t&&t.classList.add("hide-load-more")},e.showLoadMoreButton=function(t){t&&t.domNode.classList.remove("hide-load-more")},e.resetListViewHeight=function(t){var e=t.querySelector("ul");e.style.removeProperty("height"),e.style.removeProperty("overflow")},e.persistListViewHeight=function(t){var e=t.querySelector("ul");e.offsetHeight>0&&(e.style.height=e.offsetHeight+"px",e.style.overflow="hidden")},e.getListNode=function(t){return t.querySelector("ul")},e.setListNodeToEmpty=function(t){mx.logger.debug("setListNodeToEmpty");for(var e=t.querySelector("ul");e.firstChild;)e.removeChild(e.firstChild)},e.showLoader=function(t){mx.logger.debug("showLoader"),t.domNode.classList.add("widget-pagination-loading")},e.hideLoader=function(t){mx.logger.debug("hideLoader"),t.domNode.classList.remove("widget-pagination-loading")},e.mxTranslation=function(t,e,r,i,o){var n=null!=o?o:"[No translation]";return i?window.__widgets_translations&&(n=window.__widgets_translations[t+"."+e]||o||"[No translation]"):n=mx.session.getConfig("uiconfig.translations."+t+"."+e)||window.mx.session.getConfig("uiconfig.translations")[t+"."+e]||o||"[No translation]",r.reduce((function(t,e,r){return t.split("{"+(r+1)+"}").join(e)}),n)},e.getTranslations=function(){return n(void 0,void 0,void 0,(function(){var t,e,r,i;return a(this,(function(n){switch(n.label){case 0:return t=window.mx.session.getConfig("locale.code"),[4,fetch("/metamodel.json")];case 1:return[4,n.sent().json()];case 2:return(e=n.sent())&&e.systemTexts?(r=e.systemTexts,i=e.languages.indexOf(t),window.__widgets_translations=Object.keys(r).reduce((function(t,e){var n;return o(o({},t),((n={})[e]=r[e][i],n))}),{})):mx.logger.error("Error while loading translations"),[2]}}))}))}}.apply(e,[r,e]))||(t.exports=i)},function(t,r){t.exports=e},function(t,e,r){var i,o;i=[r,e,r(0),r(1)],void 0===(o=function(t,e,r,i){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.Alert=void 0,e.Alert=function(t){var e=t.bootstrapStyle,o=t.className,n=t.children;return n?r.createElement("div",{className:i("alert alert-"+e,o)},n):null},e.Alert.displayName="Alert",e.Alert.defaultProps={bootstrapStyle:"danger"}}.apply(e,i))||(t.exports=o)},function(t,e,r){var i,o,n=this&&this.__spreadArrays||function(){for(var t=0,e=0,r=arguments.length;e<r;e++)t+=arguments[e].length;var i=Array(t),o=0;for(e=0;e<r;e++)for(var n=arguments[e],a=0,s=n.length;a<s;a++,o++)i[o]=n[a];return i};i=[r,e,r(5),r(2),r(3),r(4),r(9),r(34)],void 0===(o=function(t,e,r,i,o,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.DataSourceHelper=void 0;var s=function(){function t(t){this.initialLoad=!0,this.delay=50,this.store={constraints:{_none:{}},sorting:{}},this.updateInProgress=!1,this.requiresUpdate=!1,this.sorting=[],this.constraints=[],this.widget=t,this.originalSort=window.mx.isOffline()?this.widget._datasource._sort:this.widget._datasource._sorting,r.after(t,"storeState",(function(e){(mx.logger.debug("after storeState"),t.__customWidgetDataSourceHelper)&&(e("lvcSorting",t.__customWidgetDataSourceHelper.sorting.length>0?t.__customWidgetDataSourceHelper.sorting:t.__customWidgetDataSourceHelper.originalSort),e("lvcConstraints",t.__customWidgetDataSourceHelper.constraints),e("lvcPaging",t.__customWidgetDataSourceHelper.paging))}),!0)}return t.getInstance=function(e,r){var n=e&&e.parentElement,a=o.SharedContainerUtils.findTargetListView(n,r),s=i.SharedUtils.validateCompatibility({listViewEntity:r,targetListView:a});if(!s&&a)return a.__customWidgetDataSourceHelper||(a.__customWidgetDataSourceHelper=new t(a)),a.getState("lvcPersistState",!1)||this.hideContent(a.domNode),a.__customWidgetDataSourceHelper;throw new Error(s)},t.prototype.setSorting=function(t,e,r){void 0===r&&(r=!1),this.store.sorting={},this.store.sorting[t]=e,this.registerUpdate(r)},t.prototype.setConstraint=function(t,e,r,i){var o;void 0===r&&(r="_none"),void 0===i&&(i=!1);var n=r.trim()||"_none";this.store.constraints[n]?this.store.constraints[n][t]=e:this.store.constraints[n]=((o={})[t]=e,o),this.registerUpdate(i)},t.prototype.getListView=function(){return this.widget},t.prototype.registerUpdate=function(t){var e=this;mx.logger.debug("DataSourceHelper .registerUpdate"),this.timeoutHandle&&window.clearTimeout(this.timeoutHandle),this.updateInProgress?this.requiresUpdate=!0:this.timeoutHandle=window.setTimeout((function(){mx.logger.debug("DataSourceHelper .execute"),e.updateInProgress=!0,e.iterativeUpdateDataSource(t)}),this.delay)},t.prototype.iterativeUpdateDataSource=function(t){var e=this;this.updateDataSource((function(){e.requiresUpdate?(e.requiresUpdate=!1,e.iterativeUpdateDataSource(t)):e.updateInProgress=!1}),t)},t.prototype.updateDataSource=function(e,r){var i,o,a,s,u,c=this,d=Object.keys(this.store.sorting).map((function(t){return c.store.sorting[t]})).filter((function(t){return t[0]&&t[1]}));if(d.length||(d=this.originalSort),window.mx.isOffline()){for(var l=Object.keys(this.store.constraints._none).map((function(t){return c.store.constraints._none[t]})),p=l.filter((function(t){return t.value})),f=l.filter((function(t){return t.operator})),h=[],g=0,v=Object.keys(this.store.constraints).filter((function(t){return"_none"!==t}));g<v.length;g++){for(var y=v[g],_=[],m=0,w=Object.keys(this.store.constraints[y]);m<w.length;m++){var b=w[m],x=this.store.constraints[y][b];x&&x.value&&_.push(x)}_.length&&h.push({constraints:_,operator:"or"})}a=n(p,f,h)}else{p=Object.keys(this.store.constraints._none).map((function(t){return c.store.constraints._none[t]})).join(""),h=Object.keys(this.store.constraints).filter((function(t){return"_none"!==t})).map((function(t){return"["+Object.keys(c.store.constraints[t]).map((function(e){return c.store.constraints[t][e]})).filter((function(t){return t})).map((function(t){return t.trim().substr(1,t.trim().length-2)})).join(" or ")+"]"})).join("").replace(/\[]/g,"");var S=this.widget._datasource._searchPaths,L=this.widget.hasSearch?null===(o=(i=this.widget)._getSearchText)||void 0===o?void 0:o.call(i):void 0;a=(u=L,(s=S)&&u&&""!==u.trim()?"["+s.map((function(t){return"contains("+t+",'"+L+"')"})).join(" or ")+"]":"")+p+h}if(this.sorting=d,this.constraints=a,r)t.showContent(this.widget.domNode),this.hideLoader(),this.initialLoad=!1,e();else{this.widget._datasource._constraints=a,window.mx.isOffline()?this.widget._datasource._sort=d:this.widget._datasource._sorting=d,mx.logger.debug("DataSourceHelper .set sort and constraint");var O=this.widget._datasource.getOffset(),P=this.widget._datasource.getPageSize();!this.widget.__lvcPagingEnabled&&O>0&&(mx.logger.debug("reset offset"),this.widget._datasource.setOffset(0),this.widget._datasource.setPageSize(P+O)),this.initialLoad||this.showLoader(),this.widget.update(null,(function(){mx.logger.debug("DataSourceHelper .updated"),!c.widget.__lvcPagingEnabled&&O>0&&(mx.logger.debug("restore offset"),c.widget._datasource.setOffset(O),c.widget._datasource.setPageSize(P)),c.hideLoader(),c.initialLoad=!1,e()}))}},t.prototype.showLoader=function(){this.widget.domNode.classList.add("widget-data-source-helper-loading")},t.hideContent=function(t){t&&t.classList.add("widget-data-source-helper-initial-loading")},t.showContent=function(t){t&&t.classList.remove("widget-data-source-helper-initial-loading")},t.prototype.hideLoader=function(){this.widget.domNode.classList.remove("widget-data-source-helper-loading"),t.showContent(this.widget.domNode)},t.prototype.setPaging=function(t,e){var r=this,i=this.widget._datasource;if(!this.widget.__customWidgetPagingLoading){var o=!1;void 0!==t&&t!==i.getOffset()&&(this.widget.__customWidgetPagingOffset=t,i.setOffset(t),o=!0),void 0!==e&&e!==i.getPageSize()&&(i.setPageSize(e),o=!0),this.paging={pageSize:void 0!==e?e:i.getPageSize(),offset:void 0!==t?t:i.getOffset()},o&&(mx.logger.debug(".updateDatasource changed",t,e),this.widget.__customWidgetPagingLoading=!0,this.showLoader(),this.widget.sequence(["_sourceReload","_renderData"],(function(){r.widget.__customWidgetPagingLoading=!1,a.resetListViewHeight(r.widget.domNode),mx.logger.debug(".updateDatasource updated"),r.hideLoader()})))}},t}();e.DataSourceHelper=s}.apply(e,i))||(t.exports=o)},function(t,e){t.exports=r},function(t,e,r){var i;void 0===(i=function(t,e){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),function(){var t=mxui.widget.ListView;function e(t){if(!(!t||"database"===t.datasource.type||"xpath"===t.datasource.type))return!1;var e=!!(t&&("database"===t.datasource.type||"xpath"===t.datasource.type)&&t._datasource&&t._datasource.reload&&t._datasource.setOffset&&t._datasource.setPageSize&&void 0!==t._datasource._constraints&&(t._datasource._sorting||t._datasource._sort)&&t._datasource.getSetSize&&t._datasource.getOffset);return e||mx.logger.error("This Mendix version is not compatible with list view controls. The List view controls use is limited."),e}!t.prototype.__lvcPrototypeUpdated&&function(t){var e=!!(t&&t.postCreate&&t._loadData&&t.getState&&t._onLoad&&t._renderData);e||mx.logger.error("This Mendix version is not compatible with list view controls. The List view prototype could not be updated.");return e}(t.prototype)?(t.prototype.__lvcPrototypeUpdated=!0,t.prototype.__postCreateOriginal=t.prototype.postCreate,t.prototype.postCreate=function(){if(mx.logger.debug("list view control, overwrites postCreate prototype"),this.__postCreateOriginal(),e(this)){var t=this.getState("lvcPaging");t&&(void 0!==t.offset&&this._datasource.setOffset(t.offset),void 0!==t.pageSize&&this._datasource.setPageSize(t.pageSize));var r=this.getState("lvcSorting");r&&(this._datasource._sorting=r);var i=this.getState("lvcConstraints");i&&(this._datasource._constraints=i)}},t.prototype.__loadDataOriginal=t.prototype._loadData,t.prototype._loadData=function(t){var r=this;mx.logger.debug("List view control, overwrites _loadData prototype"),e(this)?(this.__lvcPagingEnabled&&this._datasource.setOffset(0),this._datasource.reload((function(){var e=r._datasource.getOffset();if(e&&r._datasource.getSetSize()<=e)return r._datasource.setOffset(0),void r._loadData(t);r._renderData((function(){r._onLoad(),t&&t()}))}))):this.__loadDataOriginal(t)}):mx.logger.debug("Prototype update called unexpected again")}()}.apply(e,[r,e]))||(t.exports=i)},function(t,e,r){var i,o;i=[r,e,r(11)],void 0===(o=function(t,e,r){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.FormViewState=void 0;var i=function(){function t(t,e,i){this.form=t,this.widgetId=e,this.persistHandle=r.connect(t,"onPersistViewState",null,(function(t){var r=t[e]||(t[e]={});i(r)}))}return t.prototype.getPageState=function(t,e){var r=this.form,i=r&&r.viewState?r.viewState[this.widgetId]:void 0,o=i&&void 0!==i[t]?i[t]:e;return mx.logger.debug("getPageState",this.widgetId,t,e,o),o},t.prototype.destroy=function(){r.disconnect(this.persistHandle)},t}();e.FormViewState=i}.apply(e,i))||(t.exports=o)},function(t,e){t.exports=i},,,,,,,,,,function(t,e,r){var i,o,n,a=this&&this.__extends||(n=function(t,e){return(n=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(t,e){t.__proto__=e}||function(t,e){for(var r in e)e.hasOwnProperty(r)&&(t[r]=e[r])})(t,e)},function(t,e){function r(){this.constructor=t}n(t,e),t.prototype=null===e?Object.create(e):(r.prototype=e.prototype,new r)});i=[r,e,r(0),r(1),r(6),r(7),r(2),r(22),r(23),r(3),r(10)],void 0===(o=function(t,e,r,i,o,n,s,u,c,d,l){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var p=function(t){function e(e){var r=t.call(this,e)||this;return r.widgetDom=null,r.retriesFind=0,r.applySearch=r.applySearch.bind(r),r.viewStateManager=new l.FormViewState(r.props.mxform,r.props.uniqueid,(function(t){t.defaultSearchText=r.state.searchText})),r.state={alertMessage:c.Validate.validateProps(r.props),searchText:r.getDefaultValue(),listViewAvailable:!1},r}return a(e,t),e.prototype.render=function(){var t=this;return r.createElement("div",{className:i("widget-text-box-search",this.props.class),ref:function(e){return t.widgetDom=e},style:s.SharedUtils.parseStyle(this.props.style)},r.createElement(o.Alert,{className:"widget-text-box-search-alert"},this.state.alertMessage),this.renderTextBoxSearch())},e.prototype.componentDidMount=function(){s.SharedUtils.delay(this.connectToListView.bind(this),this.checkListViewAvailable.bind(this),20)},e.prototype.componentDidUpdate=function(t,e){this.state.listViewAvailable&&!e.listViewAvailable&&this.applySearch(this.state.searchText)},e.prototype.checkListViewAvailable=function(){return!!this.widgetDom&&(this.retriesFind++,this.retriesFind>25||!!d.SharedContainerUtils.findTargetListView(this.widgetDom.parentElement,this.props.entity))},e.prototype.renderTextBoxSearch=function(){return this.state.alertMessage?null:r.createElement(u.TextBoxSearch,{defaultQuery:this.state.searchText,onTextChange:this.applySearch,placeholder:this.props.placeHolder})},e.prototype.applySearch=function(t){var e=this.getConstraint(mxui.dom.escapeHTMLQuotes(t));this.dataSourceHelper&&this.dataSourceHelper.setConstraint(this.props.uniqueid,e),this.setState({searchText:t})},e.prototype.getConstraint=function(t){var e=this;if(!(t=t.trim()))return"";var r=mx.meta.getEntity(this.props.entity);if(window.mx.isOffline()){var i=[];return this.props.attributeList.forEach((function(o){if(r.isEnum(o.attribute)){var n=e.matchEnumCaptions(r,o,t);n.length>0?n.forEach((function(t){return i.push({attribute:o.attribute,operator:"contains",path:e.props.entity,value:t})})):i.push({attribute:o.attribute,operator:"contains",path:e.props.entity,value:" "})}else i.push({attribute:o.attribute,operator:"contains",path:e.props.entity,value:t})})),{constraints:i,operator:"or"}}var o=[];return this.props.attributeList.forEach((function(i){if(r.isEnum(i.attribute)){var n=e.matchEnumCaptions(r,i,t);n.length>0?n.forEach((function(t){return o.push(i.attribute+"='"+t+"'")})):o.push("contains("+i.attribute+'," ")')}else o.push("contains("+i.attribute+",'"+t+"')")})),"["+o.join(" or ")+"]"},e.prototype.matchEnumCaptions=function(t,e,r){return t.getEnumMap(e.attribute).reduce((function(t,e){return e.caption.match(new RegExp(r,"i"))&&t.push(e.key),t}),[])},e.prototype.connectToListView=function(){var t="";try{this.dataSourceHelper=n.DataSourceHelper.getInstance(this.widgetDom,this.props.entity)}catch(e){t=e.message}this.setState({alertMessage:t||c.Validate.validateProps(this.props),listViewAvailable:!t})},e.prototype.getDefaultValue=function(){return this.viewStateManager.getPageState("defaultSearchText",this.props.defaultQuery)},e}(r.Component);e.default=p}.apply(e,i))||(t.exports=o)},function(t,e,r){var i,o,n,a=this&&this.__extends||(n=function(t,e){return(n=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(t,e){t.__proto__=e}||function(t,e){for(var r in e)e.hasOwnProperty(r)&&(t[r]=e[r])})(t,e)},function(t,e){function r(){this.constructor=t}n(t,e),t.prototype=null===e?Object.create(e):(r.prototype=e.prototype,new r)});i=[r,e,r(0),r(46)],void 0===(o=function(t,e,r){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.TextBoxSearch=void 0;var i=function(t){function e(){var e=null!==t&&t.apply(this,arguments)||this;return e.searchTimeOut=500,e.resetQueryHandle=e.resetQuery.bind(e),e.onChangeHandle=e.onChange.bind(e),e.state={query:e.props.defaultQuery},e}return a(e,t),e.prototype.render=function(){return r.createElement("div",{className:"search-bar"},r.createElement("input",{className:"form-control",onChange:this.onChangeHandle,placeholder:this.props.placeholder,value:this.state.query}),this.renderReset())},e.prototype.componentWillReceiveProps=function(t){this.state.query!==t.defaultQuery&&this.setState({query:t.defaultQuery})},e.prototype.onChange=function(t){var e=this,r=t.currentTarget.value;this.state.query!==r&&(this.updateHandle&&window.clearTimeout(this.updateHandle),this.updateHandle=window.setTimeout((function(){e.props.onTextChange(r)}),this.searchTimeOut)),this.setState({query:r})},e.prototype.renderReset=function(){return this.state.query?r.createElement("button",{className:"btn-transparent visible",onClick:this.resetQueryHandle},r.createElement("span",{className:"glyphicon glyphicon-remove"})):null},e.prototype.resetQuery=function(){this.setState({query:""}),this.props.onTextChange("")},e}(r.Component);e.TextBoxSearch=i}.apply(e,i))||(t.exports=o)},function(t,e,r){var i,o;i=[r,e,r(0)],void 0===(o=function(t,e,r){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.Validate=void 0;var i=function(){function t(){}return t.validateProps=function(t){var e=[];return!t.isWebModeler&&window.mx.isOffline()&&t.attributeList.forEach((function(t,r){t.attribute.indexOf("/")>-1&&e.push("'Search attribute' at position {"+(r+1)+"} over reference is not supported in offline application")})),e.length?r.createElement("div",{},"Configuration error in widget:",e.map((function(t,e){return r.createElement("p",{key:e},t)}))):""},t}();e.Validate=i}.apply(e,i))||(t.exports=o)},,,,,,,,,,,function(t,e){},,,,,,,,,,,,function(t,e){}])}));