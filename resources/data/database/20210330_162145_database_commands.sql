ALTER TABLE "moh$template" ALTER COLUMN "formname" RENAME TO "permanentname";
ALTER TABLE "moh$template" ADD "formname" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('60e15347-926f-4a0e-a000-5c227b25d676', 
'751d135e-51a3-4016-8f68-9309bd37f381', 
'FormName', 
'formname', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '751d135e-51a3-4016-8f68-9309bd37f381', 
"attribute_name" = 'PermanentName', 
"column_name" = 'permanentname', 
"type" = 30, 
"length" = 200, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '37f2d737-00e7-4648-bc06-cf951fff5f82';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210330 16:21:45';
