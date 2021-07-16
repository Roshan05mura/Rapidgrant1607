ALTER TABLE "ugs$voucher_history" DROP CONSTRAINT "uniq_ugs$voucher_history_ugs$historyid";
ALTER TABLE "ugs$voucher_history" DROP CONSTRAINT "uniq_ugs$voucher_history_ugs$voucherid";
DROP INDEX "idx_ugs$voucher_history_ugs$history_ugs$voucher";
ALTER TABLE "ugs$voucher_history" RENAME TO "0bb8446f82cb47eb846d45610581ddd0";
ALTER TABLE "ugs$voucher" DROP COLUMN "id_";
CREATE SEQUENCE "ugs$voucher_id__mxseq" AS BIGINT START WITH 1;
ALTER TABLE "ugs$voucher" ADD "id_" BIGINT NULL;
UPDATE "ugs$voucher"
 SET "id_" = NEXT VALUE FOR "ugs$voucher_id__mxseq";
INSERT INTO "mendixsystem$sequence" ("attribute_id", 
"name", 
"start_value", 
"current_value")
 VALUES ('b2d90bdb-4760-4bf3-afaf-c1e9690c2e82', 
'ugs$voucher_id__mxseq', 
1, 
0);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '3acccdb2-ab8d-4d4b-a50a-4e5e629356e1', 
"attribute_name" = 'Id_', 
"column_name" = 'id_', 
"type" = 0, 
"length" = 0, 
"default_value" = '1', 
"is_auto_number" = true
 WHERE "id" = 'b2d90bdb-4760-4bf3-afaf-c1e9690c2e82';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '11484f4d-498a-4866-8b56-bb283c0af84e';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_ugs$voucher_history_ugs$historyid' AND "column_id" = '24e84d62-dfe2-3e88-99ab-62c9ce52a7cf';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_ugs$voucher_history_ugs$voucherid' AND "column_id" = '8b274ade-7ade-3563-943d-a154a8b243e9';
ALTER TABLE "ugs$count" ADD "forwarded_io" INT NULL;
UPDATE "ugs$count"
 SET "forwarded_io" = 0;
ALTER TABLE "ugs$count" ADD "returned" INT NULL;
UPDATE "ugs$count"
 SET "returned" = 0;
ALTER TABLE "ugs$count" ADD "cases" INT NULL;
UPDATE "ugs$count"
 SET "cases" = 0;
ALTER TABLE "ugs$count" ADD "forwarded_fa" INT NULL;
UPDATE "ugs$count"
 SET "forwarded_fa" = 0;
ALTER TABLE "ugs$count" ADD "inprogress" INT NULL;
UPDATE "ugs$count"
 SET "inprogress" = 0;
ALTER TABLE "ugs$count" ADD "forwarded_gmhq" INT NULL;
UPDATE "ugs$count"
 SET "forwarded_gmhq" = 0;
ALTER TABLE "ugs$count" ADD "resolved" INT NULL;
UPDATE "ugs$count"
 SET "resolved" = 0;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('003e91c1-9600-4578-ba86-80b96b6dd655', 
'b12eab5d-c25f-4ca9-a2e7-9326a70c4703', 
'Returned', 
'returned', 
3, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('ee404fec-2771-4d0a-8640-e9dc46d0a26d', 
'b12eab5d-c25f-4ca9-a2e7-9326a70c4703', 
'Forwarded_GMHQ', 
'forwarded_gmhq', 
3, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('8307f798-8f1c-476c-99d8-af0f03f5a1e8', 
'b12eab5d-c25f-4ca9-a2e7-9326a70c4703', 
'cases', 
'cases', 
3, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('d9042a74-d99d-47e8-9432-dd4d2ffb1ed3', 
'b12eab5d-c25f-4ca9-a2e7-9326a70c4703', 
'Resolved', 
'resolved', 
3, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('b1aab397-a84b-404c-959a-c304d5d44350', 
'b12eab5d-c25f-4ca9-a2e7-9326a70c4703', 
'Forwarded_IO', 
'forwarded_io', 
3, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('1cf895b6-4000-479c-a4a0-bba76ba5082f', 
'b12eab5d-c25f-4ca9-a2e7-9326a70c4703', 
'Forwarded_FA', 
'forwarded_fa', 
3, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('81903b76-821c-49cf-af5d-d75fac338b55', 
'b12eab5d-c25f-4ca9-a2e7-9326a70c4703', 
'Inprogress', 
'inprogress', 
3, 
0, 
'0', 
false);
ALTER TABLE "ugs$grantsystem" ADD "frequencyyear" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "ugs$grantsystem" ADD "q4_date" TIMESTAMP NULL;
ALTER TABLE "ugs$grantsystem" ADD "q1_amount" DECIMAL(28, 8) NULL;
UPDATE "ugs$grantsystem"
 SET "q1_amount" = 0;
ALTER TABLE "ugs$grantsystem" ADD "q2amount" DECIMAL(28, 8) NULL;
UPDATE "ugs$grantsystem"
 SET "q2amount" = 0;
ALTER TABLE "ugs$grantsystem" ADD "q3_amount" DECIMAL(28, 8) NULL;
UPDATE "ugs$grantsystem"
 SET "q3_amount" = 0;
ALTER TABLE "ugs$grantsystem" ADD "q3_date" TIMESTAMP NULL;
ALTER TABLE "ugs$grantsystem" ADD "q1_date" TIMESTAMP NULL;
ALTER TABLE "ugs$grantsystem" ADD "frequency" VARCHAR_IGNORECASE(11) NULL;
ALTER TABLE "ugs$grantsystem" ADD "q2_date" TIMESTAMP NULL;
ALTER TABLE "ugs$grantsystem" ADD "q4_amount" DECIMAL(28, 8) NULL;
UPDATE "ugs$grantsystem"
 SET "q4_amount" = 0;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('edfbe1bb-8533-4f55-bd79-ad9515bb3fa9', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q3_Amount', 
'q3_amount', 
5, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('c2c45682-a5cd-4afa-897c-079455f32b2f', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q4_Amount', 
'q4_amount', 
5, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('e2b98a16-ef61-4580-bc43-80f82f9dce54', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q2_Date', 
'q2_date', 
20, 
0, 
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
 VALUES ('3e3cd951-3c8e-490c-b4c7-90633035c90b', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q3_Date', 
'q3_date', 
20, 
0, 
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
 VALUES ('ed1021c3-f2cc-4377-bd17-c1fa6aa68989', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q1_Amount', 
'q1_amount', 
5, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('6f0f14a0-f046-4731-a296-53e76aed4cd6', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q4_Date', 
'q4_date', 
20, 
0, 
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
 VALUES ('ec4ea97b-9a99-4da5-b447-9eb96e333d68', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q2Amount', 
'q2amount', 
5, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('6f941f63-3e86-42a3-84e7-6d09c9745bc8', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Frequency', 
'frequency', 
40, 
11, 
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
 VALUES ('63edbfad-f14d-44b2-85d4-4f7e47a99a52', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'FrequencyYear', 
'frequencyyear', 
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
 VALUES ('85ecef16-3e5d-4e1d-9c17-bea66e15497e', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q1_Date', 
'q1_date', 
20, 
0, 
'', 
false);
ALTER TABLE "ugs$casemangement" ADD "phase" VARCHAR_IGNORECASE(16) NULL;
ALTER TABLE "ugs$casemangement" ALTER COLUMN "status" SET DATA TYPE VARCHAR_IGNORECASE(17);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'f4a695f5-122b-46a4-9acd-8cf14e8ba8ef', 
"attribute_name" = 'Status', 
"column_name" = 'status', 
"type" = 40, 
"length" = 17, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'c3db2a78-4e85-4d5d-9c6a-02c828764445';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('510031dc-6c00-443c-840d-6bb278486738', 
'f4a695f5-122b-46a4-9acd-8cf14e8ba8ef', 
'Phase', 
'phase', 
40, 
16, 
'', 
false);
CREATE TABLE "ugs$grantsystem_allinterviews" (
	"ugs$interviewid" BIGINT NOT NULL,
	"ugs$grantsystemid" BIGINT NOT NULL,
	PRIMARY KEY("ugs$interviewid","ugs$grantsystemid"),
	CONSTRAINT "uniq_ugs$grantsystem_allinterviews_ugs$interviewid" UNIQUE ("ugs$interviewid"));
CREATE INDEX "idx_ugs$grantsystem_allinterviews_ugs$grantsystem_ugs$interview" ON "ugs$grantsystem_allinterviews" ("ugs$grantsystemid" ASC,"ugs$interviewid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('62e5c5f6-a4bf-4330-97c9-daf7479c45f9', 
'UGS.GrantSystem_Allinterviews', 
'ugs$grantsystem_allinterviews', 
'17682490-1d8f-4373-babd-ca48e9eb7321', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'ugs$interviewid', 
'ugs$grantsystemid', 
'idx_ugs$grantsystem_allinterviews_ugs$grantsystem_ugs$interview');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$grantsystem_allinterviews_ugs$interviewid', 
'62e5c5f6-a4bf-4330-97c9-daf7479c45f9', 
'75d11050-17f8-3388-bbf0-e647d90a1a7c');
CREATE TABLE "ugs$voucher_grantsystem" (
	"ugs$voucherid" BIGINT NOT NULL,
	"ugs$grantsystemid" BIGINT NOT NULL,
	PRIMARY KEY("ugs$voucherid","ugs$grantsystemid"),
	CONSTRAINT "uniq_ugs$voucher_grantsystem_ugs$grantsystemid" UNIQUE ("ugs$grantsystemid"),
	CONSTRAINT "uniq_ugs$voucher_grantsystem_ugs$voucherid" UNIQUE ("ugs$voucherid"));
CREATE INDEX "idx_ugs$voucher_grantsystem_ugs$grantsystem_ugs$voucher" ON "ugs$voucher_grantsystem" ("ugs$grantsystemid" ASC,"ugs$voucherid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('21d486a3-8689-4665-a6cd-3eef82a76261', 
'UGS.Voucher_GrantSystem', 
'ugs$voucher_grantsystem', 
'3acccdb2-ab8d-4d4b-a50a-4e5e629356e1', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'ugs$voucherid', 
'ugs$grantsystemid', 
'idx_ugs$voucher_grantsystem_ugs$grantsystem_ugs$voucher');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$voucher_grantsystem_ugs$grantsystemid', 
'21d486a3-8689-4665-a6cd-3eef82a76261', 
'7eff20c8-6b96-3dd6-b810-2504483abeef');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$voucher_grantsystem_ugs$voucherid', 
'21d486a3-8689-4665-a6cd-3eef82a76261', 
'16f93e91-eba0-3000-99c7-82e557c344b0');
DROP TABLE "0bb8446f82cb47eb846d45610581ddd0";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210716 20:00:52';
