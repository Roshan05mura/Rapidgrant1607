ALTER TABLE "ugs$grantsystem" ADD "contractsigned" BOOLEAN NULL;
UPDATE "ugs$grantsystem"
 SET "contractsigned" = false;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('e38325e5-aae2-463e-bd28-7ae1776a4ff1', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'ContractSigned', 
'contractsigned', 
10, 
0, 
'false', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210720 10:12:00';
