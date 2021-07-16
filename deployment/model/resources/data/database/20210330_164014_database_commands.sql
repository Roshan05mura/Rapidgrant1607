CREATE TABLE "moh$doc" (
	"id" BIGINT NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"superentity_id", 
"remote", 
"remote_primary_key")
 VALUES ('ea27a280-ba11-496e-b417-4e4f61f1cffb', 
'MOH.Doc', 
'moh$doc', 
'5c678307-9603-45e9-8472-c02153438fcf', 
false, 
false);
CREATE TABLE "moh$document_doc" (
	"moh$documentid" BIGINT NOT NULL,
	"moh$docid" BIGINT NOT NULL,
	PRIMARY KEY("moh$documentid","moh$docid"),
	CONSTRAINT "uniq_moh$document_doc_moh$docid" UNIQUE ("moh$docid"),
	CONSTRAINT "uniq_moh$document_doc_moh$documentid" UNIQUE ("moh$documentid"));
CREATE INDEX "idx_moh$document_doc_moh$doc_moh$document" ON "moh$document_doc" ("moh$docid" ASC,"moh$documentid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('dee821cc-395f-4d0d-8ae0-62280022849d', 
'MOH.Document_Doc', 
'moh$document_doc', 
'f14983cb-4dbb-4a6a-9e0d-fc14f46707aa', 
'ea27a280-ba11-496e-b417-4e4f61f1cffb', 
'moh$documentid', 
'moh$docid', 
'idx_moh$document_doc_moh$doc_moh$document');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_moh$document_doc_moh$docid', 
'dee821cc-395f-4d0d-8ae0-62280022849d', 
'7179f99f-bc1d-3204-8282-3029b2a11dd0');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_moh$document_doc_moh$documentid', 
'dee821cc-395f-4d0d-8ae0-62280022849d', 
'387469e2-7c8c-3110-b7bb-ded6cf9dd21c');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210330 16:40:14';
