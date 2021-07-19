ALTER TABLE "administration$account_selectinterviewers" DROP CONSTRAINT "uniq_administration$account_selectinterviewers_administration$accountid";
ALTER TABLE "ugs$casemangement_currentholdingaccount" DROP CONSTRAINT "uniq_ugs$casemangement_currentholdingaccount_administration$accountid";
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_administration$account_selectinterviewers_administration$accountid' AND "column_id" = '35404ffb-d074-3f44-b6ec-447a3b2146de';
ALTER TABLE "ugs$grantsystem" ADD "review_view_type" VARCHAR_IGNORECASE(19) NULL;
UPDATE "ugs$grantsystem"
 SET "review_view_type" = 'Application';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('27c421f3-6dcd-440d-b9de-602608df0f79', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'Review_view_type', 
'review_view_type', 
40, 
19, 
'Application', 
false);
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_ugs$casemangement_currentholdingaccount_administration$accountid' AND "column_id" = '9184b307-388b-3b21-8147-2aadce689144';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210719 17:17:48';
