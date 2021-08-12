ALTER TABLE "ugs$grant_" ADD "xpath" VARCHAR_IGNORECASE(2147483647) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('28690b5e-6607-49e0-bde1-8eed39bbd07d', 
'2657116c-46f1-4005-94b3-389a32e4a500', 
'Xpath', 
'xpath', 
30, 
0, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210807 15:02:13';
