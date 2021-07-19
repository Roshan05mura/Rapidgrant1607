ALTER TABLE "ugs$grantsystem" DROP COLUMN "q9_date";
ALTER TABLE "ugs$grantsystem" DROP COLUMN "q8_date";
ALTER TABLE "ugs$grantsystem" DROP COLUMN "q7_date";
ALTER TABLE "ugs$grantsystem" DROP COLUMN "q6_date";
ALTER TABLE "ugs$grantsystem" DROP COLUMN "q12_date";
ALTER TABLE "ugs$grantsystem" DROP COLUMN "q11_date";
ALTER TABLE "ugs$grantsystem" DROP COLUMN "q10_date";
ALTER TABLE "ugs$grantsystem" ADD "q9_date" TIMESTAMP NULL;
ALTER TABLE "ugs$grantsystem" ADD "q8_date" TIMESTAMP NULL;
ALTER TABLE "ugs$grantsystem" ADD "q7_date" TIMESTAMP NULL;
ALTER TABLE "ugs$grantsystem" ADD "q6_date" TIMESTAMP NULL;
ALTER TABLE "ugs$grantsystem" ADD "q12_date" TIMESTAMP NULL;
ALTER TABLE "ugs$grantsystem" ADD "q11_date" TIMESTAMP NULL;
ALTER TABLE "ugs$grantsystem" ADD "q10_date" TIMESTAMP NULL;
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
"attribute_name" = 'Q6_Date', 
"column_name" = 'q6_date', 
"type" = 20, 
"length" = 0, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'da6c8d9c-d7f8-4f7b-a76c-0da33503dd0c';
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
"attribute_name" = 'Q8_Date', 
"column_name" = 'q8_date', 
"type" = 20, 
"length" = 0, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'e1e355f6-4c2c-4c8f-93fb-c85f46f950ea';
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
"attribute_name" = 'Q12_Date', 
"column_name" = 'q12_date', 
"type" = 20, 
"length" = 0, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '976c4069-b51d-418a-9988-fe46a501aa54';
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
"attribute_name" = 'Q11_Date', 
"column_name" = 'q11_date', 
"type" = 20, 
"length" = 0, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '6e13332c-e150-40d7-b11a-06547482954a';
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
"attribute_name" = 'Q9_Date', 
"column_name" = 'q9_date', 
"type" = 20, 
"length" = 0, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '0c2d3054-cbb5-4864-a49d-8944fe2739d2';
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
"attribute_name" = 'Q7_Date', 
"column_name" = 'q7_date', 
"type" = 20, 
"length" = 0, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '733098e3-c3ed-4022-8232-d3419f3ac522';
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
"attribute_name" = 'Q10_Date', 
"column_name" = 'q10_date', 
"type" = 20, 
"length" = 0, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '3cf8c78f-fd6a-4895-bd5d-cfb9735f88ce';
ALTER TABLE "ugs$history" ADD "createddate" TIMESTAMP NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('a1b6d918-62d0-35a2-989c-afcd67548562', 
'e70f3c9e-bd90-43f9-ad40-9ae4878cc803', 
'createdDate', 
'createddate', 
20, 
0, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210719 13:59:22';
