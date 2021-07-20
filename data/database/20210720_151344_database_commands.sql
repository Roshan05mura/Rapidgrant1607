ALTER TABLE "ugs$reviewform" ADD "emptyc" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('ddcecc0b-9510-4446-8c23-98565d12b1ec', 
'fe996542-7842-424e-9e6c-c33121f232cd', 
'EmptyC', 
'emptyc', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210720 15:13:44';
