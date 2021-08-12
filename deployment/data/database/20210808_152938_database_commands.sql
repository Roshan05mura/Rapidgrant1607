ALTER TABLE "ugs$grantsystem" ADD "searchname" VARCHAR_IGNORECASE(2147483647) NULL;
ALTER TABLE "ugs$grantsystem" ADD "savedsearchresultsxpath" BOOLEAN NULL;
UPDATE "ugs$grantsystem"
 SET "savedsearchresultsxpath" = false;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('39941202-e5eb-4559-8694-467ee2659f4c', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'SearchName', 
'searchname', 
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
 VALUES ('2d00ec6a-c6d7-48fa-bee1-e0bfe192d28e', 
'ba9d4296-9a81-4e9d-af93-a6f38307e8d2', 
'SavedSearchResultsXpath', 
'savedsearchresultsxpath', 
10, 
0, 
'false', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210808 15:29:37';
