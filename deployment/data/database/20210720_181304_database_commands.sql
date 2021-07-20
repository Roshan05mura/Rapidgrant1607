ALTER TABLE "ugs$interview" ADD "interviewers" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('33f8ea70-23f8-4c90-82d6-b398211cd917', 
'17682490-1d8f-4373-babd-ca48e9eb7321', 
'Interviewers', 
'interviewers', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210720 18:13:04';
