ALTER TABLE "ugs$grantsystem" ADD "review_view_type" VARCHAR_IGNORECASE(19) NULL;
UPDATE "ugs$grantsystem"
 SET "review_view_type" = 'Application';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('27c421f3-6dcd-440d-b9de-602608df0f79', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Review_view_type', 
'review_view_type', 
40, 
19, 
'Application', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210719 16:13:57';
