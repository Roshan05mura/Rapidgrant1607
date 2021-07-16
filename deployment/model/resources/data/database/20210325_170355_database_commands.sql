CREATE TABLE "moh$enum_values" (
	"id" BIGINT NOT NULL,
	"value" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('a6420131-ec49-4a26-8353-a8ed85b86bbd', 
'MOH.Enum_Values', 
'moh$enum_values', 
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
 VALUES ('b0fe346e-edbd-4c22-9423-8aeefce6f5f6', 
'a6420131-ec49-4a26-8353-a8ed85b86bbd', 
'Value', 
'value', 
30, 
200, 
'', 
false);
CREATE TABLE "moh$enumeration" (
	"id" BIGINT NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"superentity_id", 
"remote", 
"remote_primary_key")
 VALUES ('701b5aa4-7b5e-4f78-9a76-1b8dc1c44f2c', 
'MOH.Enumeration', 
'moh$enumeration', 
'5c678307-9603-45e9-8472-c02153438fcf', 
false, 
false);
CREATE TABLE "moh$enumeration_enum_values" (
	"moh$enumerationid" BIGINT NOT NULL,
	"moh$enum_valuesid" BIGINT NOT NULL,
	PRIMARY KEY("moh$enumerationid","moh$enum_valuesid"),
	CONSTRAINT "uniq_moh$enumeration_enum_values_moh$enumerationid" UNIQUE ("moh$enumerationid"));
CREATE INDEX "idx_moh$enumeration_enum_values_moh$enum_values_moh$enumeration" ON "moh$enumeration_enum_values" ("moh$enum_valuesid" ASC,"moh$enumerationid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('8b608c7c-2c8a-49cb-a167-8080a7f529a1', 
'MOH.Enumeration_Enum_Values', 
'moh$enumeration_enum_values', 
'701b5aa4-7b5e-4f78-9a76-1b8dc1c44f2c', 
'a6420131-ec49-4a26-8353-a8ed85b86bbd', 
'moh$enumerationid', 
'moh$enum_valuesid', 
'idx_moh$enumeration_enum_values_moh$enum_values_moh$enumeration');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_moh$enumeration_enum_values_moh$enumerationid', 
'8b608c7c-2c8a-49cb-a167-8080a7f529a1', 
'3b3b1a39-c54e-3d42-9418-fe7349e56872');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210325 17:03:55';
