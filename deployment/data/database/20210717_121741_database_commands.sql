ALTER TABLE "ugs$test_grantsystem" DROP CONSTRAINT "uniq_ugs$test_grantsystem_ugs$testid";
ALTER TABLE "ugs$test_grantsystem" DROP CONSTRAINT "uniq_ugs$test_grantsystem_ugs$grantsystemid";
DROP INDEX "idx_ugs$test_grantsystem_ugs$grantsystem_ugs$test";
ALTER TABLE "ugs$test_grantsystem" RENAME TO "ugs$test_grantsystem_dummy";
ALTER TABLE "dynamicform$workflowroles" ALTER COLUMN "reviewtype" SET DATA TYPE VARCHAR_IGNORECASE(19);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'a2b82c8c-8d38-4c49-b534-d88e3e433018', 
"attribute_name" = 'ReviewType', 
"column_name" = 'reviewtype', 
"type" = 40, 
"length" = 19, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'a96471ab-800e-40bf-8a71-32815ee67ae5';
ALTER TABLE "ugs$test" ADD "remarks" VARCHAR_IGNORECASE(2147483647) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('6fc5621d-5c2a-4103-87cb-3f2dcaad4ea3', 
'aa12fb20-565e-448d-9381-01d99b093c53', 
'Remarks', 
'remarks', 
30, 
0, 
'', 
false);
CREATE INDEX "idx_ugs$test_grantsystem_dummy_ugs$grantsystem_ugs$test" ON "ugs$test_grantsystem_dummy" ("ugs$grantsystemid" ASC,"ugs$testid" ASC);
ALTER TABLE "ugs$test_grantsystem_dummy" ADD CONSTRAINT "uniq_ugs$test_grantsystem_dummy_ugs$grantsystemid" UNIQUE ("ugs$grantsystemid");
ALTER TABLE "ugs$test_grantsystem_dummy" ADD CONSTRAINT "uniq_ugs$test_grantsystem_dummy_ugs$testid" UNIQUE ("ugs$testid");
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_ugs$test_grantsystem_ugs$testid' AND "column_id" = '5ca578ad-303f-3ab4-b742-95c70ae10d41';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_ugs$test_grantsystem_ugs$grantsystemid' AND "column_id" = 'eef78521-f195-3544-b56a-2474ad15c037';
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$test_grantsystem_dummy_ugs$grantsystemid', 
'e1de291c-020b-4d0e-b5a7-472695ec8b35', 
'eef78521-f195-3544-b56a-2474ad15c037');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$test_grantsystem_dummy_ugs$testid', 
'e1de291c-020b-4d0e-b5a7-472695ec8b35', 
'5ca578ad-303f-3ab4-b742-95c70ae10d41');
UPDATE "mendixsystem$association"
 SET "association_name" = 'UGS.Test_GrantSystem_Dummy', 
"table_name" = 'ugs$test_grantsystem_dummy', 
"parent_entity_id" = 'aa12fb20-565e-448d-9381-01d99b093c53', 
"child_entity_id" = 'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
"parent_column_name" = 'ugs$testid', 
"child_column_name" = 'ugs$grantsystemid', 
"pk_index_name" = NULL, 
"index_name" = 'idx_ugs$test_grantsystem_dummy_ugs$grantsystem_ugs$test'
 WHERE "id" = 'e1de291c-020b-4d0e-b5a7-472695ec8b35';
ALTER TABLE "ugs$fundings" ADD "requestedamount" DECIMAL(28, 8) NULL;
UPDATE "ugs$fundings"
 SET "requestedamount" = 0;
ALTER TABLE "ugs$fundings" ADD "availableamounts" DECIMAL(28, 8) NULL;
UPDATE "ugs$fundings"
 SET "availableamounts" = 0;
ALTER TABLE "ugs$fundings" ALTER COLUMN "fundings_status" SET DATA TYPE VARCHAR_IGNORECASE(19);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'aa3bd608-02eb-41ba-8b3c-3a85819ab43b', 
"attribute_name" = 'Fundings_Status', 
"column_name" = 'fundings_status', 
"type" = 40, 
"length" = 19, 
"default_value" = 'Awarded', 
"is_auto_number" = false
 WHERE "id" = '0136c9e1-9e1d-4c1c-a63f-03ef49ea4c09';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('7befaf31-89ac-4ee2-9cb1-362f0280ab61', 
'aa3bd608-02eb-41ba-8b3c-3a85819ab43b', 
'RequestedAmount', 
'requestedamount', 
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
 VALUES ('af66b680-f912-4b85-8f83-91d64abb605c', 
'aa3bd608-02eb-41ba-8b3c-3a85819ab43b', 
'AvailableAmounts', 
'availableamounts', 
5, 
0, 
'0', 
false);
ALTER TABLE "ugs$grantsystem" DROP COLUMN "q3_amount";
ALTER TABLE "ugs$grantsystem" DROP COLUMN "q1_amount";
ALTER TABLE "ugs$grantsystem" DROP COLUMN "q2amount";
ALTER TABLE "ugs$grantsystem" DROP COLUMN "frequencyyear";
ALTER TABLE "ugs$grantsystem" DROP COLUMN "q4_amount";
ALTER TABLE "ugs$grantsystem" ALTER COLUMN "reviewtype" RENAME TO "ratingtype";
ALTER TABLE "ugs$grantsystem" ADD "frequencyperiod_int" INT NULL;
UPDATE "ugs$grantsystem"
 SET "frequencyperiod_int" = 0;
ALTER TABLE "ugs$grantsystem" ADD "availablerequest" INT NULL;
UPDATE "ugs$grantsystem"
 SET "availablerequest" = 0;
ALTER TABLE "ugs$grantsystem" ADD "q12_date" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "ugs$grantsystem" ADD "q1_amount" DECIMAL(28, 8) NULL;
UPDATE "ugs$grantsystem"
 SET "q1_amount" = 0;
ALTER TABLE "ugs$grantsystem" ADD "q6_date" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "ugs$grantsystem" ADD "totalrequest" INT NULL;
UPDATE "ugs$grantsystem"
 SET "totalrequest" = 0;
ALTER TABLE "ugs$grantsystem" ADD "q9_date" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "ugs$grantsystem" ADD "q5_date" TIMESTAMP NULL;
ALTER TABLE "ugs$grantsystem" ADD "q10_date" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "ugs$grantsystem" ADD "q7_date" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "ugs$grantsystem" ADD "reviewtype" VARCHAR_IGNORECASE(19) NULL;
UPDATE "ugs$grantsystem"
 SET "reviewtype" = 'Rating';
ALTER TABLE "ugs$grantsystem" ADD "q8_date" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "ugs$grantsystem" ADD "frequencyyear" VARCHAR_IGNORECASE(2) NULL;
ALTER TABLE "ugs$grantsystem" ADD "q11_date" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "ugs$grantsystem" ADD "freuencyyears_int" INT NULL;
UPDATE "ugs$grantsystem"
 SET "freuencyyears_int" = 0;
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = 'c2c45682-a5cd-4afa-897c-079455f32b2f';
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = 'ec4ea97b-9a99-4da5-b447-9eb96e333d68';
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = 'edfbe1bb-8533-4f55-bd79-ad9515bb3fa9';
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
"attribute_name" = 'Q5_Date', 
"column_name" = 'q5_date', 
"type" = 20, 
"length" = 0, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'ed1021c3-f2cc-4377-bd17-c1fa6aa68989';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('da6c8d9c-d7f8-4f7b-a76c-0da33503dd0c', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q6_Date', 
'q6_date', 
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
 VALUES ('8865be27-3030-44bf-b091-d672097dc5b6', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'ReviewType', 
'reviewtype', 
40, 
19, 
'Rating', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('6c7edab2-d63d-4633-8d04-a6ce8e071224', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'FrequencyPeriod_Int', 
'frequencyperiod_int', 
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
 VALUES ('28e7dfe4-89b3-4469-b852-b7324c37341a', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'AvailableRequest', 
'availablerequest', 
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
 VALUES ('7dac9265-9aec-4e95-aac7-7c6e056d9996', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'FreuencyYears_Int', 
'freuencyyears_int', 
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
 VALUES ('e1e355f6-4c2c-4c8f-93fb-c85f46f950ea', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q8_Date', 
'q8_date', 
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
 VALUES ('976c4069-b51d-418a-9988-fe46a501aa54', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q12_Date', 
'q12_date', 
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
 VALUES ('6e13332c-e150-40d7-b11a-06547482954a', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q11_Date', 
'q11_date', 
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
 VALUES ('967bb2f8-7669-4fc3-8e47-3f175d9f200c', 
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
 VALUES ('0c2d3054-cbb5-4864-a49d-8944fe2739d2', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q9_Date', 
'q9_date', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
"attribute_name" = 'RatingType', 
"column_name" = 'ratingtype', 
"type" = 40, 
"length" = 10, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'd2d84850-9212-4bde-98cf-274dab21fd4f';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('e9084c0b-8c4c-4c5d-8367-ec68472246f8', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'TotalRequest', 
'totalrequest', 
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
 VALUES ('733098e3-c3ed-4022-8232-d3419f3ac522', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q7_Date', 
'q7_date', 
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
 VALUES ('3cf8c78f-fd6a-4895-bd5d-cfb9735f88ce', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Q10_Date', 
'q10_date', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
"attribute_name" = 'FrequencyYear', 
"column_name" = 'frequencyyear', 
"type" = 40, 
"length" = 2, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '63edbfad-f14d-44b2-85d4-4f7e47a99a52';
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'f4a695f5-122b-46a4-9acd-8cf14e8ba8ef', 
"attribute_name" = 'Phase', 
"column_name" = 'phase', 
"type" = 40, 
"length" = 16, 
"default_value" = 'Graduation_Phase', 
"is_auto_number" = false
 WHERE "id" = '510031dc-6c00-443c-840d-6bb278486738';
ALTER TABLE "ugs$reviewform" ADD "numericalscoreasenum" VARCHAR_IGNORECASE(2) NULL;
ALTER TABLE "ugs$reviewform" ADD "average_score" INT NULL;
UPDATE "ugs$reviewform"
 SET "average_score" = 0;
ALTER TABLE "ugs$reviewform" ADD "reviewtype" VARCHAR_IGNORECASE(19) NULL;
UPDATE "ugs$reviewform"
 SET "reviewtype" = 'Rating';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('20c5e957-cab7-443d-857a-c6f12bd41c9f', 
'fe996542-7842-424e-9e6c-c33121f232cd', 
'NumericalScoreAsEnum', 
'numericalscoreasenum', 
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
 VALUES ('5ee96503-b0ab-49e0-8796-78659f90da5c', 
'fe996542-7842-424e-9e6c-c33121f232cd', 
'Average_Score', 
'average_score', 
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
 VALUES ('65ca6ea6-097a-47ec-8046-5a67a1952b6a', 
'fe996542-7842-424e-9e6c-c33121f232cd', 
'ReviewType', 
'reviewtype', 
40, 
19, 
'Rating', 
false);
CREATE TABLE "ugs$activity" (
	"id" BIGINT NOT NULL,
	"additionalinput" VARCHAR_IGNORECASE(200) NULL,
	"activityname" VARCHAR_IGNORECASE(200) NULL,
	"remarks" VARCHAR_IGNORECASE(200) NULL,
	"schedule" TIMESTAMP NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('c67310b7-881e-4edc-8a69-3e31a79f0638', 
'UGS.Activity', 
'ugs$activity', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('b6041f75-4519-4fcd-b5e3-8a61db17e3b2', 
'c67310b7-881e-4edc-8a69-3e31a79f0638', 
'AdditionalInput', 
'additionalinput', 
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
 VALUES ('373e6e57-6b6e-42f9-8bd8-ea1e1010c102', 
'c67310b7-881e-4edc-8a69-3e31a79f0638', 
'ActivityName', 
'activityname', 
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
 VALUES ('af87860c-9da4-43e5-869a-a61fe8a8b49a', 
'c67310b7-881e-4edc-8a69-3e31a79f0638', 
'Remarks', 
'remarks', 
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
 VALUES ('324326c6-24b8-4f7e-93fa-a9cad5e948fd', 
'c67310b7-881e-4edc-8a69-3e31a79f0638', 
'Schedule', 
'schedule', 
20, 
0, 
'', 
false);
CREATE TABLE "ugs$activity_grantsystem" (
	"ugs$activityid" BIGINT NOT NULL,
	"ugs$grantsystemid" BIGINT NOT NULL,
	PRIMARY KEY("ugs$activityid","ugs$grantsystemid"),
	CONSTRAINT "uniq_ugs$activity_grantsystem_ugs$activityid" UNIQUE ("ugs$activityid"));
CREATE INDEX "idx_ugs$activity_grantsystem_ugs$grantsystem_ugs$activity" ON "ugs$activity_grantsystem" ("ugs$grantsystemid" ASC,"ugs$activityid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('2f208b22-39c6-4779-b127-4be095906b2d', 
'UGS.Activity_GrantSystem', 
'ugs$activity_grantsystem', 
'c67310b7-881e-4edc-8a69-3e31a79f0638', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'ugs$activityid', 
'ugs$grantsystemid', 
'idx_ugs$activity_grantsystem_ugs$grantsystem_ugs$activity');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$activity_grantsystem_ugs$activityid', 
'2f208b22-39c6-4779-b127-4be095906b2d', 
'3839722b-1207-39a4-b1a8-e97f28e4d177');
CREATE TABLE "ugs$activity_interview" (
	"ugs$activityid" BIGINT NOT NULL,
	"ugs$interviewid" BIGINT NOT NULL,
	PRIMARY KEY("ugs$activityid","ugs$interviewid"),
	CONSTRAINT "uniq_ugs$activity_interview_ugs$interviewid" UNIQUE ("ugs$interviewid"),
	CONSTRAINT "uniq_ugs$activity_interview_ugs$activityid" UNIQUE ("ugs$activityid"));
CREATE INDEX "idx_ugs$activity_interview_ugs$interview_ugs$activity" ON "ugs$activity_interview" ("ugs$interviewid" ASC,"ugs$activityid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('0a74ae5a-be4e-4214-912e-117165d00cf7', 
'UGS.Activity_Interview', 
'ugs$activity_interview', 
'c67310b7-881e-4edc-8a69-3e31a79f0638', 
'17682490-1d8f-4373-babd-ca48e9eb7321', 
'ugs$activityid', 
'ugs$interviewid', 
'idx_ugs$activity_interview_ugs$interview_ugs$activity');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$activity_interview_ugs$interviewid', 
'0a74ae5a-be4e-4214-912e-117165d00cf7', 
'3f1b1258-b059-38b5-b23e-02c1f9ef85de');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$activity_interview_ugs$activityid', 
'0a74ae5a-be4e-4214-912e-117165d00cf7', 
'f4fc7a70-fbdf-3655-9fcd-6043d735ccb6');
CREATE TABLE "ugs$test_activity" (
	"ugs$testid" BIGINT NOT NULL,
	"ugs$activityid" BIGINT NOT NULL,
	PRIMARY KEY("ugs$testid","ugs$activityid"),
	CONSTRAINT "uniq_ugs$test_activity_ugs$activityid" UNIQUE ("ugs$activityid"),
	CONSTRAINT "uniq_ugs$test_activity_ugs$testid" UNIQUE ("ugs$testid"));
CREATE INDEX "idx_ugs$test_activity_ugs$activity_ugs$test" ON "ugs$test_activity" ("ugs$activityid" ASC,"ugs$testid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('094be204-d04c-471e-aded-56d8b5cbd199', 
'UGS.Test_Activity', 
'ugs$test_activity', 
'aa12fb20-565e-448d-9381-01d99b093c53', 
'c67310b7-881e-4edc-8a69-3e31a79f0638', 
'ugs$testid', 
'ugs$activityid', 
'idx_ugs$test_activity_ugs$activity_ugs$test');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$test_activity_ugs$activityid', 
'094be204-d04c-471e-aded-56d8b5cbd199', 
'713913f8-d7b9-304d-9678-4df9dcd4f165');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$test_activity_ugs$testid', 
'094be204-d04c-471e-aded-56d8b5cbd199', 
'dac1492f-3ad4-3f66-aa5e-eae71c022fc2');
CREATE TABLE "ugs$test_grantsystem_assigned" (
	"ugs$testid" BIGINT NOT NULL,
	"ugs$grantsystemid" BIGINT NOT NULL,
	PRIMARY KEY("ugs$testid","ugs$grantsystemid"),
	CONSTRAINT "uniq_ugs$test_grantsystem_assigned_ugs$testid" UNIQUE ("ugs$testid"));
CREATE INDEX "idx_ugs$test_grantsystem_assigned_ugs$grantsystem_ugs$test" ON "ugs$test_grantsystem_assigned" ("ugs$grantsystemid" ASC,"ugs$testid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('710e683b-cf97-41aa-88f4-f9f027f61199', 
'UGS.Test_GrantSystem_assigned', 
'ugs$test_grantsystem_assigned', 
'aa12fb20-565e-448d-9381-01d99b093c53', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'ugs$testid', 
'ugs$grantsystemid', 
'idx_ugs$test_grantsystem_assigned_ugs$grantsystem_ugs$test');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$test_grantsystem_assigned_ugs$testid', 
'710e683b-cf97-41aa-88f4-f9f027f61199', 
'3b7a1909-247d-354d-a475-0b0ac7262733');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210717 12:17:41';
