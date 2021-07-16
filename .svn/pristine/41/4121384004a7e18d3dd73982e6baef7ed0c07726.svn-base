ALTER TABLE "moh$enumeration_enum_values" DROP CONSTRAINT "uniq_moh$enumeration_enum_values_moh$enumerationid";
DROP INDEX "idx_moh$enumeration_enum_values_moh$enum_values_moh$enumeration";
ALTER TABLE "moh$enumeration_enum_values" RENAME TO "e43b71ad3c3743db83ac863c1bd95509";
ALTER TABLE "moh$visit_details_workflow" DROP CONSTRAINT "uniq_moh$visit_details_workflow_moh$workflowid";
ALTER TABLE "moh$visit_details_workflow" DROP CONSTRAINT "uniq_moh$visit_details_workflow_moh$visit_detailsid";
DROP INDEX "idx_moh$visit_details_workflow_moh$workflow_moh$visit_details";
ALTER TABLE "moh$visit_details_workflow" RENAME TO "31e8d1ea2dc34c669452c0e9d842ed12";
ALTER TABLE "moh$proofdocuments" ADD "uuid" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('7e960b80-1d06-4267-8614-693180040744', 
'1359a249-3604-45cb-a13e-7413ea10c90e', 
'UuId', 
'uuid', 
30, 
200, 
'', 
false);
ALTER TABLE "moh$number" ADD "expression" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "moh$number" ADD "formula" BOOLEAN NULL;
UPDATE "moh$number"
 SET "formula" = false;
ALTER TABLE "moh$number" ADD "variablename" VARCHAR_IGNORECASE(2) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('9b922c1c-fa06-4876-a978-7adff0f09280', 
'46c186bf-c0c5-4fbf-93a6-34b425ebd6a9', 
'Formula', 
'formula', 
10, 
0, 
'false', 
false);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '46c186bf-c0c5-4fbf-93a6-34b425ebd6a9', 
"attribute_name" = 'NumberValue', 
"column_name" = 'numbervalue', 
"type" = 3, 
"length" = 0, 
"default_value" = '0', 
"is_auto_number" = false
 WHERE "id" = '592a580e-8e10-4210-bef8-7e33543bdd14';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('7fe7818d-f07e-48fa-b488-4843b8de0270', 
'46c186bf-c0c5-4fbf-93a6-34b425ebd6a9', 
'Expression', 
'expression', 
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
 VALUES ('3672fbf9-9b66-40aa-811a-000e25d3f741', 
'46c186bf-c0c5-4fbf-93a6-34b425ebd6a9', 
'VariableName', 
'variablename', 
30, 
2, 
'', 
false);
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '8b608c7c-2c8a-49cb-a167-8080a7f529a1';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_moh$enumeration_enum_values_moh$enumerationid';
ALTER TABLE "moh$template" ALTER COLUMN "defaulttemplate" RENAME TO "active";
ALTER TABLE "moh$template" ALTER COLUMN "templatename" RENAME TO "formname";
ALTER TABLE "moh$template" ADD "form_description" VARCHAR_IGNORECASE(2147483647) NULL;
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '751d135e-51a3-4016-8f68-9309bd37f381', 
"attribute_name" = 'Active', 
"column_name" = 'active', 
"type" = 10, 
"length" = 0, 
"default_value" = 'false', 
"is_auto_number" = false
 WHERE "id" = '7f09381a-a0a5-42ad-a4d7-abc3591bf493';
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '751d135e-51a3-4016-8f68-9309bd37f381', 
"attribute_name" = 'FormName', 
"column_name" = 'formname', 
"type" = 30, 
"length" = 200, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '37f2d737-00e7-4648-bc06-cf951fff5f82';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('c35c70e7-8133-4154-b2d2-841317eb2fae', 
'751d135e-51a3-4016-8f68-9309bd37f381', 
'Form_Description', 
'form_description', 
30, 
0, 
'', 
false);
ALTER TABLE "moh$visit_details" DROP COLUMN "i_subventional_amount";
ALTER TABLE "moh$visit_details" DROP COLUMN "i_total_bill";
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = '7cf821db-a8bf-4335-add3-331ab8d46095';
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = 'cdeed1dc-6e61-4240-b84b-25843b2d5c29';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '2dc461c0-87e9-4244-b589-9a1e0c7e3bce';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_moh$visit_details_workflow_moh$workflowid';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_moh$visit_details_workflow_moh$visit_detailsid';
ALTER TABLE "moh$institutions" ADD "remainingbudget" DECIMAL(28, 8) NULL;
UPDATE "moh$institutions"
 SET "remainingbudget" = 0;
ALTER TABLE "moh$institutions" ALTER COLUMN "institutionname" SET DATA TYPE VARCHAR_IGNORECASE(200);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'a1fb980f-cc6c-41a0-baad-ddfcc2b5e5fd', 
"attribute_name" = 'InstitutionName', 
"column_name" = 'institutionname', 
"type" = 30, 
"length" = 200, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'a69486ec-a2c2-44dc-8680-62d992458f35';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('5d422ffe-0c94-460c-8d1d-521ac6214868', 
'a1fb980f-cc6c-41a0-baad-ddfcc2b5e5fd', 
'RemainingBudget', 
'remainingbudget', 
5, 
0, 
'0', 
false);
CREATE TABLE "moh$visit_details_workflow" (
	"moh$visit_detailsid" BIGINT NOT NULL,
	"moh$workflowid" BIGINT NOT NULL,
	PRIMARY KEY("moh$visit_detailsid","moh$workflowid"),
	CONSTRAINT "uniq_moh$visit_details_workflow_moh$workflowid" UNIQUE ("moh$workflowid"),
	CONSTRAINT "uniq_moh$visit_details_workflow_moh$visit_detailsid" UNIQUE ("moh$visit_detailsid"));
CREATE INDEX "idx_moh$visit_details_workflow_moh$workflow_moh$visit_details" ON "moh$visit_details_workflow" ("moh$workflowid" ASC,"moh$visit_detailsid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('33357cdb-06ce-4c9b-87eb-8c422a665016', 
'MOH.Visit_Details_Workflow', 
'moh$visit_details_workflow', 
'a00ca440-f0ad-4808-82ec-7dba091d4e18', 
'ef6f5fdf-2abd-4ae0-b3ec-0846e0968f95', 
'moh$visit_detailsid', 
'moh$workflowid', 
'idx_moh$visit_details_workflow_moh$workflow_moh$visit_details');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_moh$visit_details_workflow_moh$workflowid', 
'33357cdb-06ce-4c9b-87eb-8c422a665016', 
'd1b71792-7fa5-3367-9bf7-877364521b30');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_moh$visit_details_workflow_moh$visit_detailsid', 
'33357cdb-06ce-4c9b-87eb-8c422a665016', 
'59dec4f6-6e98-3c39-a9f9-c32a89343481');
CREATE TABLE "moh$enum_values_enumeration" (
	"moh$enum_valuesid" BIGINT NOT NULL,
	"moh$enumerationid" BIGINT NOT NULL,
	PRIMARY KEY("moh$enum_valuesid","moh$enumerationid"),
	CONSTRAINT "uniq_moh$enum_values_enumeration_moh$enum_valuesid" UNIQUE ("moh$enum_valuesid"));
CREATE INDEX "idx_moh$enum_values_enumeration_moh$enumeration_moh$enum_values" ON "moh$enum_values_enumeration" ("moh$enumerationid" ASC,"moh$enum_valuesid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('0840c38a-38ea-40ed-9165-4d68e269362e', 
'MOH.Enum_Values_Enumeration', 
'moh$enum_values_enumeration', 
'a6420131-ec49-4a26-8353-a8ed85b86bbd', 
'701b5aa4-7b5e-4f78-9a76-1b8dc1c44f2c', 
'moh$enum_valuesid', 
'moh$enumerationid', 
'idx_moh$enum_values_enumeration_moh$enumeration_moh$enum_values');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_moh$enum_values_enumeration_moh$enum_valuesid', 
'0840c38a-38ea-40ed-9165-4d68e269362e', 
'5a7ed3fe-3ed6-3f54-b25d-6acde07e8f2f');
CREATE TABLE "moh$dontuse" (
	"moh$enumerationid" BIGINT NOT NULL,
	"moh$enum_valuesid" BIGINT NOT NULL,
	PRIMARY KEY("moh$enumerationid","moh$enum_valuesid"),
	CONSTRAINT "uniq_moh$dontuse_moh$enumerationid" UNIQUE ("moh$enumerationid"));
CREATE INDEX "idx_moh$dontuse_moh$enum_values_moh$enumeration" ON "moh$dontuse" ("moh$enum_valuesid" ASC,"moh$enumerationid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('2cf3aacf-ba35-41c5-946b-5e70c7af9a85', 
'MOH.DontUse', 
'moh$dontuse', 
'701b5aa4-7b5e-4f78-9a76-1b8dc1c44f2c', 
'a6420131-ec49-4a26-8353-a8ed85b86bbd', 
'moh$enumerationid', 
'moh$enum_valuesid', 
'idx_moh$dontuse_moh$enum_values_moh$enumeration');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_moh$dontuse_moh$enumerationid', 
'2cf3aacf-ba35-41c5-946b-5e70c7af9a85', 
'933ddead-0d7b-399b-8cb0-e86540fb38e1');
DROP TABLE "e43b71ad3c3743db83ac863c1bd95509";
DROP TABLE "31e8d1ea2dc34c669452c0e9d842ed12";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210330 11:05:00';
