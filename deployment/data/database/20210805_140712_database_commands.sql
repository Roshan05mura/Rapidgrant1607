CREATE TABLE "ugs$header_2" (
	"id" BIGINT NOT NULL,
	"header" VARCHAR_IGNORECASE(200) NULL,
	"selected" BOOLEAN NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('b2c2b1a2-2afa-4aee-b6eb-3d87d003628f', 
'UGS.Header_2', 
'ugs$header_2', 
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
 VALUES ('fbd9a5f9-80f7-43fb-b618-2371d1f5be86', 
'b2c2b1a2-2afa-4aee-b6eb-3d87d003628f', 
'Header', 
'header', 
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
 VALUES ('aaa07037-2499-4cb9-ae9d-ad148bdbda2d', 
'b2c2b1a2-2afa-4aee-b6eb-3d87d003628f', 
'Selected', 
'selected', 
10, 
0, 
'true', 
false);
CREATE TABLE "ugs$grantsystem_header_2" (
	"ugs$grantsystemid" BIGINT NOT NULL,
	"ugs$header_2id" BIGINT NOT NULL,
	PRIMARY KEY("ugs$grantsystemid","ugs$header_2id"),
	CONSTRAINT "uniq_ugs$grantsystem_header_2_ugs$header_2id" UNIQUE ("ugs$header_2id"),
	CONSTRAINT "uniq_ugs$grantsystem_header_2_ugs$grantsystemid" UNIQUE ("ugs$grantsystemid"));
CREATE INDEX "idx_ugs$grantsystem_header_2_ugs$header_2_ugs$grantsystem" ON "ugs$grantsystem_header_2" ("ugs$header_2id" ASC,"ugs$grantsystemid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('344a02a0-6b9b-4a77-8a1b-92ebc854b5de', 
'UGS.GrantSystem_Header_2', 
'ugs$grantsystem_header_2', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'b2c2b1a2-2afa-4aee-b6eb-3d87d003628f', 
'ugs$grantsystemid', 
'ugs$header_2id', 
'idx_ugs$grantsystem_header_2_ugs$header_2_ugs$grantsystem');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$grantsystem_header_2_ugs$header_2id', 
'344a02a0-6b9b-4a77-8a1b-92ebc854b5de', 
'874fd4f0-5ceb-38e0-9a13-e8d869574efd');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_ugs$grantsystem_header_2_ugs$grantsystemid', 
'344a02a0-6b9b-4a77-8a1b-92ebc854b5de', 
'a16269db-88f2-3acd-a269-59d8aab36a19');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210805 14:07:12';
