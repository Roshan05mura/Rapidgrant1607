ALTER TABLE "ugs$casemangement_currentholdingaccount" DROP CONSTRAINT "uniq_ugs$casemangement_currentholdingaccount_administration$accountid";
ALTER TABLE "ugs$faq" ADD "link" VARCHAR_IGNORECASE(10000) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('00120f48-92b0-48a8-b68e-8839b215270e', 
'6df7c3ef-844f-4192-a9c7-488c87ec74d5', 
'link', 
'link', 
30, 
10000, 
'', 
false);
ALTER TABLE "ugs$progressupdate" ADD "subject" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "ugs$progressupdate" ADD "grade" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "ugs$progressupdate" ADD "remarks" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('a2b06bc5-87f6-4b0e-b352-198b0b714efb', 
'723b252b-ebaf-4021-b28e-607d596abda3', 
'Remarks', 
'remarks', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('5545e017-082a-4986-bcb2-d3d47de345bd', 
'723b252b-ebaf-4021-b28e-607d596abda3', 
'Grade', 
'grade', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('ffaade0b-b28b-4a09-b777-9faeba4d8703', 
'723b252b-ebaf-4021-b28e-607d596abda3', 
'Subject', 
'subject', 
30, 
200, 
'', 
false);
ALTER TABLE "ugs$casemangement" ADD "changeddate" TIMESTAMP NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('63a039f1-0cac-3a5f-8523-3c9a8fa558d0', 
'f4a695f5-122b-46a4-9acd-8cf14e8ba8ef', 
'changedDate', 
'changeddate', 
20, 
0, 
'', 
false);
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_ugs$casemangement_currentholdingaccount_administration$accountid' AND "column_id" = '9184b307-388b-3b21-8147-2aadce689144';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210720 09:53:25';
