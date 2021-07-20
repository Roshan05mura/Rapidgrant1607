ALTER TABLE "administration$account_selectinterviewers" DROP CONSTRAINT "uniq_administration$account_selectinterviewers_administration$accountid";
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_administration$account_selectinterviewers_administration$accountid' AND "column_id" = '35404ffb-d074-3f44-b6ec-447a3b2146de';
CREATE TABLE "ugs$grantsystem_userrole" (
	"ugs$grantsystemid" BIGINT NOT NULL,
	"system$userroleid" BIGINT NOT NULL,
	PRIMARY KEY("ugs$grantsystemid","system$userroleid"),
	CONSTRAINT "uniq_ugs$grantsystem_userrole_ugs$grantsystemid" UNIQUE ("ugs$grantsystemid"));
CREATE INDEX "idx_ugs$grantsystem_userrole_system$userrole_ugs$grantsystem" ON "ugs$grantsystem_userrole" ("system$userroleid" ASC,"ugs$grantsystemid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('96d44678-cc4e-4c1b-b02b-a5b7b4950de3', 
'UGS.GrantSystem_UserRole', 
'ugs$grantsystem_userrole', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'92ef30a6-de04-423c-84fd-a21e9b9eeae2', 
'ugs$grantsystemid', 
'system$userroleid', 
'idx_ugs$grantsystem_userrole_system$userrole_ugs$grantsystem');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$grantsystem_userrole_ugs$grantsystemid', 
'96d44678-cc4e-4c1b-b02b-a5b7b4950de3', 
'10897357-8079-3a9c-a566-a8a81cf33761');
CREATE TABLE "ugs$faq" (
	"id" BIGINT NOT NULL,
	"answers" VARCHAR_IGNORECASE(2147483647) NULL,
	"questions" VARCHAR_IGNORECASE(10000) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"superentity_id", 
"remote", 
"remote_primary_key")
 VALUES ('6df7c3ef-844f-4192-a9c7-488c87ec74d5', 
'UGS.FAQ', 
'ugs$faq', 
'170ce49d-f29c-4fac-99a6-b55e8a3aeb39', 
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
 VALUES ('8176f83f-1514-42da-b353-b230046d841f', 
'6df7c3ef-844f-4192-a9c7-488c87ec74d5', 
'Answers', 
'answers', 
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
 VALUES ('67a4c093-a72c-4fe3-9389-8a0b0b9aae74', 
'6df7c3ef-844f-4192-a9c7-488c87ec74d5', 
'Questions', 
'questions', 
30, 
10000, 
'', 
false);
CREATE TABLE "ugs$faq_grantsystem" (
	"ugs$faqid" BIGINT NOT NULL,
	"ugs$grantsystemid" BIGINT NOT NULL,
	PRIMARY KEY("ugs$faqid","ugs$grantsystemid"),
	CONSTRAINT "uniq_ugs$faq_grantsystem_ugs$faqid" UNIQUE ("ugs$faqid"));
CREATE INDEX "idx_ugs$faq_grantsystem_ugs$grantsystem_ugs$faq" ON "ugs$faq_grantsystem" ("ugs$grantsystemid" ASC,"ugs$faqid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('bca48d6e-1c76-49c3-aaa4-f25dc5bd4e62', 
'UGS.FAQ_GrantSystem', 
'ugs$faq_grantsystem', 
'6df7c3ef-844f-4192-a9c7-488c87ec74d5', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'ugs$faqid', 
'ugs$grantsystemid', 
'idx_ugs$faq_grantsystem_ugs$grantsystem_ugs$faq');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$faq_grantsystem_ugs$faqid', 
'bca48d6e-1c76-49c3-aaa4-f25dc5bd4e62', 
'80777c38-d1c8-32d5-ab81-5581dd63eb9e');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210719 15:16:31';
