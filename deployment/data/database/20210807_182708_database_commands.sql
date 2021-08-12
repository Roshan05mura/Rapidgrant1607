ALTER TABLE "ugs$grantsystem" ADD "clone" BOOLEAN NULL;
UPDATE "ugs$grantsystem"
 SET "clone" = false;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('6ef2f44a-3447-44db-a4aa-fe0d02bc6141', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Clone', 
'clone', 
10, 
0, 
'false', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210807 18:27:08';
