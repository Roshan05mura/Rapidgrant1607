ALTER TABLE "moh$template" ADD "defaulttemplate" BOOLEAN NULL;
UPDATE "moh$template"
 SET "defaulttemplate" = false;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('7f09381a-a0a5-42ad-a4d7-abc3591bf493', 
'751d135e-51a3-4016-8f68-9309bd37f381', 
'DefaultTemplate', 
'defaulttemplate', 
10, 
0, 
'false', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210323 18:29:58';
