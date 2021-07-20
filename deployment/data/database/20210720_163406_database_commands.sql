ALTER TABLE "ugs$reviewform" ADD "createddate" TIMESTAMP NULL;
ALTER TABLE "ugs$reviewform" ADD "emptyc" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('53d315d9-1979-3bac-a0b3-375ce800d6a8', 
'fe996542-7842-424e-9e6c-c33121f232cd', 
'createdDate', 
'createddate', 
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
 VALUES ('ddcecc0b-9510-4446-8c23-98565d12b1ec', 
'fe996542-7842-424e-9e6c-c33121f232cd', 
'EmptyC', 
'emptyc', 
30, 
200, 
'', 
false);
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
"lastsyncdate" = '20210720 16:34:06';
