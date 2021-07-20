ALTER TABLE "ugs$interview" ADD "jsonstring" VARCHAR_IGNORECASE(2147483647) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('aba16d3e-fd73-416f-b1ab-f150f296b7cb', 
'17682490-1d8f-4373-babd-ca48e9eb7321', 
'JsonString', 
'jsonstring', 
30, 
0, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210720 11:16:02';
