ALTER TABLE "ugs$grantsystem" ADD "dynamicsave" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('c0cf8f7c-b5dc-40b1-94a3-5a3027efb2da', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'DynamicSave', 
'dynamicsave', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210810 12:23:46';
