ALTER TABLE "ugs$organization" ADD "primaryaddress" VARCHAR_IGNORECASE(2147483647) NULL;
ALTER TABLE "ugs$organization" ADD "coordinator" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "ugs$organization" ADD "contactnumber" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "ugs$organization" ADD "keypeople" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "ugs$organization" ADD "bankaccount" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "ugs$organization" ADD "primaryemail" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('5eb4a64a-6ea3-4a16-bf5a-45964990665f', 
'09d4ff91-0f1b-4f3e-ba3f-5afcb2d0fcbe', 
'KeyPeople', 
'keypeople', 
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
 VALUES ('3e0845f7-c85a-48ee-b52a-3901ba8ef573', 
'09d4ff91-0f1b-4f3e-ba3f-5afcb2d0fcbe', 
'PrimaryAddress', 
'primaryaddress', 
30, 
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
 VALUES ('e52c7f29-cbc6-438b-a0f4-5175ac4b706e', 
'09d4ff91-0f1b-4f3e-ba3f-5afcb2d0fcbe', 
'ContactNumber', 
'contactnumber', 
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
 VALUES ('3c379a14-36ae-439a-937a-c866f89f96db', 
'09d4ff91-0f1b-4f3e-ba3f-5afcb2d0fcbe', 
'PrimaryEmail', 
'primaryemail', 
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
 VALUES ('e27505d9-4961-4e12-b58e-c9123be80844', 
'09d4ff91-0f1b-4f3e-ba3f-5afcb2d0fcbe', 
'BankAccount', 
'bankaccount', 
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
 VALUES ('7bbd99fd-89ff-4b4f-a173-11729354ff57', 
'09d4ff91-0f1b-4f3e-ba3f-5afcb2d0fcbe', 
'Coordinator', 
'coordinator', 
30, 
200, 
'', 
false);
ALTER TABLE "ugs$grantsystem" ADD "fromfunds" BOOLEAN NULL;
UPDATE "ugs$grantsystem"
 SET "fromfunds" = false;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('9598d58e-614e-4954-92d3-bf8e16e50953', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'FromFunds', 
'fromfunds', 
10, 
0, 
'false', 
false);
ALTER TABLE "ugs$history" ADD "currentuser_" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('fccac1f9-e006-4276-aa0c-d7bd2029a4ff', 
'e70f3c9e-bd90-43f9-ad40-9ae4878cc803', 
'CurrentUser_', 
'currentuser_', 
30, 
200, 
'', 
false);
CREATE TABLE "ugs$grantsystem_count" (
	"ugs$grantsystemid" BIGINT NOT NULL,
	"dynamicform$countid" BIGINT NOT NULL,
	PRIMARY KEY("ugs$grantsystemid","dynamicform$countid"),
	CONSTRAINT "uniq_ugs$grantsystem_count_dynamicform$countid" UNIQUE ("dynamicform$countid"),
	CONSTRAINT "uniq_ugs$grantsystem_count_ugs$grantsystemid" UNIQUE ("ugs$grantsystemid"));
CREATE INDEX "idx_ugs$grantsystem_count_dynamicform$count_ugs$grantsystem" ON "ugs$grantsystem_count" ("dynamicform$countid" ASC,"ugs$grantsystemid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('8808314d-cde1-455c-9ad7-3515fd83f8ec', 
'UGS.GrantSystem_Count', 
'ugs$grantsystem_count', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'5d378a97-7ab7-4484-9956-60c5c289541a', 
'ugs$grantsystemid', 
'dynamicform$countid', 
'idx_ugs$grantsystem_count_dynamicform$count_ugs$grantsystem');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$grantsystem_count_dynamicform$countid', 
'8808314d-cde1-455c-9ad7-3515fd83f8ec', 
'86ace967-9b21-3ce3-ae54-913676ff29b5');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$grantsystem_count_ugs$grantsystemid', 
'8808314d-cde1-455c-9ad7-3515fd83f8ec', 
'9d35f781-1113-350e-8e46-bc06b96fe9e4');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210721 00:00:16';
