ALTER TABLE "moh$visit_details" ADD "year" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "moh$visit_details" ADD "quater" VARCHAR_IGNORECASE(2) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('d8017fe2-da15-4d97-b5bc-b5d0fd97491a', 
'a00ca440-f0ad-4808-82ec-7dba091d4e18', 
'Quater', 
'quater', 
40, 
2, 
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
 VALUES ('f68d06cf-8230-425e-9eae-53ba2879b9ba', 
'a00ca440-f0ad-4808-82ec-7dba091d4e18', 
'Year', 
'year', 
30, 
200, 
'', 
false);
ALTER TABLE "moh$workload" ADD "subventional_amount" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "moh$workload" ADD "sladeadline" TIMESTAMP NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('4bdfd877-f1a4-437f-91ce-25f25ec0f8d8', 
'c04caaf8-e9f1-4a0f-87f6-388dd4acc3ea', 
'Subventional_Amount', 
'subventional_amount', 
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
 VALUES ('f3d7a12d-859d-4ae9-86a6-775a2e1b26b6', 
'c04caaf8-e9f1-4a0f-87f6-388dd4acc3ea', 
'SlaDeadline', 
'sladeadline', 
20, 
0, 
'', 
false);
CREATE TABLE "moh$visit_details_patientbill" (
	"moh$visit_detailsid" BIGINT NOT NULL,
	"moh$patientbillid" BIGINT NOT NULL,
	PRIMARY KEY("moh$visit_detailsid","moh$patientbillid"),
	CONSTRAINT "uniq_moh$visit_details_patientbill_moh$patientbillid" UNIQUE ("moh$patientbillid"),
	CONSTRAINT "uniq_moh$visit_details_patientbill_moh$visit_detailsid" UNIQUE ("moh$visit_detailsid"));
CREATE INDEX "idx_moh$visit_details_patientbill_moh$patientbill_moh$visit_details" ON "moh$visit_details_patientbill" ("moh$patientbillid" ASC,"moh$visit_detailsid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('f3f47ac5-0d01-4b01-b580-d9fbba220f0f', 
'MOH.Visit_Details_PatientBill', 
'moh$visit_details_patientbill', 
'a00ca440-f0ad-4808-82ec-7dba091d4e18', 
'e09c2f9c-aa6e-48d0-80ee-d631d839f828', 
'moh$visit_detailsid', 
'moh$patientbillid', 
'idx_moh$visit_details_patientbill_moh$patientbill_moh$visit_details');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_moh$visit_details_patientbill_moh$patientbillid', 
'f3f47ac5-0d01-4b01-b580-d9fbba220f0f', 
'23e85bb2-d715-38a5-a87d-77e456eb207d');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_moh$visit_details_patientbill_moh$visit_detailsid', 
'f3f47ac5-0d01-4b01-b580-d9fbba220f0f', 
'45a5ce22-6a93-3c1f-88c9-2ced990aae2e');
CREATE TABLE "moh$patient_details_institutions" (
	"moh$patient_detailsid" BIGINT NOT NULL,
	"moh$institutionsid" BIGINT NOT NULL,
	PRIMARY KEY("moh$patient_detailsid","moh$institutionsid"),
	CONSTRAINT "uniq_moh$patient_details_institutions_moh$patient_detailsid" UNIQUE ("moh$patient_detailsid"));
CREATE INDEX "idx_moh$patient_details_institutions_moh$institutions_moh$patient_details" ON "moh$patient_details_institutions" ("moh$institutionsid" ASC,"moh$patient_detailsid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('fbb3fce1-c6f8-41a6-b91b-e201b6e6312f', 
'MOH.Patient_Details_Institutions', 
'moh$patient_details_institutions', 
'fd3d16e6-c7bb-4828-8066-d508ce9dfaab', 
'a1fb980f-cc6c-41a0-baad-ddfcc2b5e5fd', 
'moh$patient_detailsid', 
'moh$institutionsid', 
'idx_moh$patient_details_institutions_moh$institutions_moh$patient_details');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_moh$patient_details_institutions_moh$patient_detailsid', 
'fbb3fce1-c6f8-41a6-b91b-e201b6e6312f', 
'0a8af90c-2fab-376d-9e8e-0d600db5d507');
CREATE TABLE "moh$patientbill" (
	"id" BIGINT NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"superentity_id", 
"remote", 
"remote_primary_key")
 VALUES ('e09c2f9c-aa6e-48d0-80ee-d631d839f828', 
'MOH.PatientBill', 
'moh$patientbill', 
'170ce49d-f29c-4fac-99a6-b55e8a3aeb39', 
false, 
false);
CREATE TABLE "moh$workload_workflow" (
	"moh$workloadid" BIGINT NOT NULL,
	"moh$workflowid" BIGINT NOT NULL,
	PRIMARY KEY("moh$workloadid","moh$workflowid"),
	CONSTRAINT "uniq_moh$workload_workflow_moh$workflowid" UNIQUE ("moh$workflowid"),
	CONSTRAINT "uniq_moh$workload_workflow_moh$workloadid" UNIQUE ("moh$workloadid"));
CREATE INDEX "idx_moh$workload_workflow_moh$workflow_moh$workload" ON "moh$workload_workflow" ("moh$workflowid" ASC,"moh$workloadid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('f6484bc3-eae2-4648-abea-57b03cdc2983', 
'MOH.Workload_Workflow', 
'moh$workload_workflow', 
'c04caaf8-e9f1-4a0f-87f6-388dd4acc3ea', 
'ef6f5fdf-2abd-4ae0-b3ec-0846e0968f95', 
'moh$workloadid', 
'moh$workflowid', 
'idx_moh$workload_workflow_moh$workflow_moh$workload');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_moh$workload_workflow_moh$workflowid', 
'f6484bc3-eae2-4648-abea-57b03cdc2983', 
'90028c14-3835-3ae8-97b3-9d1ccb2cdfed');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_moh$workload_workflow_moh$workloadid', 
'f6484bc3-eae2-4648-abea-57b03cdc2983', 
'5024f264-c791-3224-900e-3fff9e1096f2');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210524 13:13:25';
