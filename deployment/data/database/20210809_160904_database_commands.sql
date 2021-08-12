ALTER TABLE "ugs$grantsystem" DROP COLUMN "savedsearchresultsxpath";
ALTER TABLE "ugs$grantsystem" DROP COLUMN "searchname";
ALTER TABLE "ugs$grantsystem" ADD "main_dropdown" VARCHAR_IGNORECASE(21) NULL;
ALTER TABLE "ugs$grantsystem" ADD "filtertype" VARCHAR_IGNORECASE(12) NULL;
ALTER TABLE "ugs$grantsystem" ADD "grantdetails_searchenum" VARCHAR_IGNORECASE(9) NULL;
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = '2d00ec6a-c6d7-48fa-bee1-e0bfe192d28e';
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = '39941202-e5eb-4559-8694-467ee2659f4c';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('8b69bb7a-e809-4b9d-a47e-38e4fc750107', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'GrantDetails_searchEnum', 
'grantdetails_searchenum', 
40, 
9, 
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
 VALUES ('cd39c916-2374-40ea-a769-573ffab56375', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'FilterType', 
'filtertype', 
40, 
12, 
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
 VALUES ('6910c438-0987-408f-bb6d-83da665b4340', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Main_Dropdown', 
'main_dropdown', 
40, 
21, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210809 16:09:04';
