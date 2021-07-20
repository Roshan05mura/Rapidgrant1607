ALTER TABLE "ugs$progressupdate" ALTER COLUMN "grantid" RENAME TO "reference_no";
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '723b252b-ebaf-4021-b28e-607d596abda3', 
"attribute_name" = 'Reference_No', 
"column_name" = 'reference_no', 
"type" = 3, 
"length" = 0, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'f105ef13-8159-4891-9cc6-00b45c3857f4';
CREATE TABLE "ugs$progressupdate_account" (
	"ugs$progressupdateid" BIGINT NOT NULL,
	"administration$accountid" BIGINT NOT NULL,
	PRIMARY KEY("ugs$progressupdateid","administration$accountid"),
	CONSTRAINT "uniq_ugs$progressupdate_account_ugs$progressupdateid" UNIQUE ("ugs$progressupdateid"));
CREATE INDEX "idx_ugs$progressupdate_account_administration$account_ugs$progressupdate" ON "ugs$progressupdate_account" ("administration$accountid" ASC,"ugs$progressupdateid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('b0b5f678-649a-4826-8b14-a4a58a975d65', 
'UGS.ProgressUpdate_Account', 
'ugs$progressupdate_account', 
'723b252b-ebaf-4021-b28e-607d596abda3', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'ugs$progressupdateid', 
'administration$accountid', 
'idx_ugs$progressupdate_account_administration$account_ugs$progressupdate');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$progressupdate_account_ugs$progressupdateid', 
'b0b5f678-649a-4826-8b14-a4a58a975d65', 
'4f2f6422-3278-3b69-9e2b-fe6655e3fc7e');
CREATE TABLE "ugs$progressupdate_grantsystem" (
	"ugs$progressupdateid" BIGINT NOT NULL,
	"ugs$grantsystemid" BIGINT NOT NULL,
	PRIMARY KEY("ugs$progressupdateid","ugs$grantsystemid"),
	CONSTRAINT "uniq_ugs$progressupdate_grantsystem_ugs$grantsystemid" UNIQUE ("ugs$grantsystemid"),
	CONSTRAINT "uniq_ugs$progressupdate_grantsystem_ugs$progressupdateid" UNIQUE ("ugs$progressupdateid"));
CREATE INDEX "idx_ugs$progressupdate_grantsystem_ugs$grantsystem_ugs$progressupdate" ON "ugs$progressupdate_grantsystem" ("ugs$grantsystemid" ASC,"ugs$progressupdateid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('0c6f1892-f266-46ac-a760-6009373792bf', 
'UGS.ProgressUpdate_GrantSystem', 
'ugs$progressupdate_grantsystem', 
'723b252b-ebaf-4021-b28e-607d596abda3', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'ugs$progressupdateid', 
'ugs$grantsystemid', 
'idx_ugs$progressupdate_grantsystem_ugs$grantsystem_ugs$progressupdate');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$progressupdate_grantsystem_ugs$grantsystemid', 
'0c6f1892-f266-46ac-a760-6009373792bf', 
'15b77d70-4c20-3b35-8150-09de13e677d1');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$progressupdate_grantsystem_ugs$progressupdateid', 
'0c6f1892-f266-46ac-a760-6009373792bf', 
'1fbe394c-2b2c-3598-a437-a36e3d9e06f4');
CREATE TABLE "ugs$profile_organization" (
	"ugs$profileid" BIGINT NOT NULL,
	"ugs$organizationid" BIGINT NOT NULL,
	PRIMARY KEY("ugs$profileid","ugs$organizationid"),
	CONSTRAINT "uniq_ugs$profile_organization_ugs$organizationid" UNIQUE ("ugs$organizationid"),
	CONSTRAINT "uniq_ugs$profile_organization_ugs$profileid" UNIQUE ("ugs$profileid"));
CREATE INDEX "idx_ugs$profile_organization_ugs$organization_ugs$profile" ON "ugs$profile_organization" ("ugs$organizationid" ASC,"ugs$profileid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('3e14f014-ff2a-4978-91b3-f83593208b43', 
'UGS.Profile_Organization', 
'ugs$profile_organization', 
'3902c8b9-1511-4498-b799-34a6f531ef0a', 
'09d4ff91-0f1b-4f3e-ba3f-5afcb2d0fcbe', 
'ugs$profileid', 
'ugs$organizationid', 
'idx_ugs$profile_organization_ugs$organization_ugs$profile');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$profile_organization_ugs$organizationid', 
'3e14f014-ff2a-4978-91b3-f83593208b43', 
'b9fc6d35-1640-343d-add8-909c8cb6f21b');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$profile_organization_ugs$profileid', 
'3e14f014-ff2a-4978-91b3-f83593208b43', 
'd0effee0-3d3e-39dc-9be2-0b7dcefe51dd');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210720 16:29:52';
