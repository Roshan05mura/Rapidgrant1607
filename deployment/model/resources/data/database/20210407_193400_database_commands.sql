CREATE TABLE "moh$template_patient_details" (
	"moh$templateid" BIGINT NOT NULL,
	"moh$patient_detailsid" BIGINT NOT NULL,
	PRIMARY KEY("moh$templateid","moh$patient_detailsid"),
	CONSTRAINT "uniq_moh$template_patient_details_moh$patient_detailsid" UNIQUE ("moh$patient_detailsid"),
	CONSTRAINT "uniq_moh$template_patient_details_moh$templateid" UNIQUE ("moh$templateid"));
CREATE INDEX "idx_moh$template_patient_details_moh$patient_details_moh$template" ON "moh$template_patient_details" ("moh$patient_detailsid" ASC,"moh$templateid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('d9fce4b2-c4b8-47ca-8fa2-8d20a411c396', 
'MOH.Template_Patient_Details', 
'moh$template_patient_details', 
'751d135e-51a3-4016-8f68-9309bd37f381', 
'fd3d16e6-c7bb-4828-8066-d508ce9dfaab', 
'moh$templateid', 
'moh$patient_detailsid', 
'idx_moh$template_patient_details_moh$patient_details_moh$template');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_moh$template_patient_details_moh$patient_detailsid', 
'd9fce4b2-c4b8-47ca-8fa2-8d20a411c396', 
'6150d3a9-9040-3deb-baf0-b6cbcb0d23c9');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_moh$template_patient_details_moh$templateid', 
'd9fce4b2-c4b8-47ca-8fa2-8d20a411c396', 
'd6f32258-d405-38d3-b776-43876eb41e8d');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210407 19:34:00';
