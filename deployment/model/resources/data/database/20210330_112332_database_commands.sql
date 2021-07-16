ALTER TABLE "moh$template" ADD "changeddate" TIMESTAMP NULL;
ALTER TABLE "moh$template" ADD "system$changedby" BIGINT NULL;
ALTER TABLE "moh$template" ADD "createddate" TIMESTAMP NULL;
ALTER TABLE "moh$template" ADD "main" BOOLEAN NULL;
UPDATE "moh$template"
 SET "main" = false;
ALTER TABLE "moh$template" ADD "system$owner" BIGINT NULL;
CREATE INDEX "idx_moh$template_system$owner" ON "moh$template" ("system$owner" ASC,"id" ASC);
CREATE INDEX "idx_moh$template_system$changedby" ON "moh$template" ("system$changedby" ASC,"id" ASC);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('c9bc272e-4ebc-321c-9608-1890d2f09485', 
'751d135e-51a3-4016-8f68-9309bd37f381', 
'changedDate', 
'changeddate', 
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
 VALUES ('8531a27e-a6e5-3bc7-aa78-ce08b533450e', 
'751d135e-51a3-4016-8f68-9309bd37f381', 
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
 VALUES ('7ffe146c-296e-45a0-9b04-a1de9df91968', 
'751d135e-51a3-4016-8f68-9309bd37f381', 
'Main', 
'main', 
10, 
0, 
'false', 
false);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name")
 VALUES ('1b994eaa-3b21-3084-a554-1fe0aebc7cc1', 
'System.owner', 
'system$owner', 
'751d135e-51a3-4016-8f68-9309bd37f381', 
'282e2e60-88a5-469d-84a5-ba8d9151644f', 
'id', 
'system$owner');
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name")
 VALUES ('de084d44-011f-3ac6-94d8-0cabc868d43e', 
'System.changedBy', 
'system$changedby', 
'751d135e-51a3-4016-8f68-9309bd37f381', 
'282e2e60-88a5-469d-84a5-ba8d9151644f', 
'id', 
'system$changedby');
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('65161721-afc3-30f6-b3fd-6b63035cd6d5', 
'751d135e-51a3-4016-8f68-9309bd37f381', 
'idx_moh$template_system$owner');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('65161721-afc3-30f6-b3fd-6b63035cd6d5', 
'1b994eaa-3b21-3084-a554-1fe0aebc7cc1', 
false, 
0);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('534537f6-7bd0-3f5c-b561-505c9a5697b2', 
'751d135e-51a3-4016-8f68-9309bd37f381', 
'idx_moh$template_system$changedby');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('534537f6-7bd0-3f5c-b561-505c9a5697b2', 
'de084d44-011f-3ac6-94d8-0cabc868d43e', 
false, 
0);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210330 11:23:32';
