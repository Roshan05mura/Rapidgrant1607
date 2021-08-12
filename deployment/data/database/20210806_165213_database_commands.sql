ALTER TABLE "ugs$grantsystem" ADD "xpath" VARCHAR_IGNORECASE(2147483647) NULL;
ALTER TABLE "ugs$grantsystem" ADD "datatable" BOOLEAN NULL;
UPDATE "ugs$grantsystem"
 SET "datatable" = false;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('9c2d0395-669b-454f-8736-2e7e6832a29e', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'DataTable', 
'datatable', 
10, 
0, 
'false', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('bd12102f-5f3a-4a1c-a37d-1ce0b027dba5', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Xpath', 
'xpath', 
30, 
0, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210806 16:52:13';
