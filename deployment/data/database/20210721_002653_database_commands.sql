ALTER TABLE "dynamicform$workflowroles" ADD "staticrole" BOOLEAN NULL;
UPDATE "dynamicform$workflowroles"
 SET "staticrole" = false;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('246a2a37-04b8-4c9e-8b91-09ba18ee6b32', 
'a2b82c8c-8d38-4c49-b534-d88e3e433018', 
'StaticRole', 
'staticrole', 
10, 
0, 
'false', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210721 00:26:53';
