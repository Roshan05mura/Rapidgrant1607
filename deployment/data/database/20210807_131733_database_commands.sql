ALTER TABLE "ugs$grant_" ADD "datatable" BOOLEAN NULL;
UPDATE "ugs$grant_"
 SET "datatable" = false;
ALTER TABLE "ugs$grant_" ALTER COLUMN "nationality" SET DATA TYPE VARCHAR_IGNORECASE(200);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('afce5e5d-92a5-4cd2-873b-85fc578eccae', 
'2657116c-46f1-4005-94b3-389a32e4a500', 
'DataTable', 
'datatable', 
10, 
0, 
'false', 
false);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '2657116c-46f1-4005-94b3-389a32e4a500', 
"attribute_name" = 'Nationality', 
"column_name" = 'nationality', 
"type" = 30, 
"length" = 200, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '66efee49-7aff-48ea-885e-8c3e41612792';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210807 13:17:33';
