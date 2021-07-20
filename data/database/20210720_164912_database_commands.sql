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
ALTER TABLE "ugs$reviewform" ADD "createddate" TIMESTAMP NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('53d315d9-1979-3bac-a0b3-375ce800d6a8', 
'fe996542-7842-424e-9e6c-c33121f232cd', 
'createdDate', 
'createddate', 
20, 
0, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210720 16:49:12';
