CREATE TABLE "_PREFIX_former_names" (
	"dbid" INTEGER NOT NULL,
	"playerId" INTEGER NOT NULL,
	"formerName" VARCHAR(13) NOT NULL DEFAULT '0',
	"changeType" TINYINT NOT NULL DEFAULT 0,
	"time" INTEGER NOT NULL DEFAULT 0,
	"whoChanged" VARCHAR(12) NOT NULL DEFAULT '0',
	"reason" VARCHAR(120) NOT NULL DEFAULT '0',
	PRIMARY KEY ("dbid")
)
;

ALTER TABLE "_PREFIX_players"
	ADD COLUMN "former_name" VARCHAR(13) NOT NULL DEFAULT '';

ALTER TABLE "_PREFIX_friends"
	ADD COLUMN "friendFormerName" VARCHAR(13) NOT NULL DEFAULT '';

ALTER TABLE "_PREFIX_ignores"
	ADD COLUMN "ignoreFormer" BIGINT(19) NOT NULL DEFAULT '0';
CREATE INDEX ignoreFormer ON ignores(ignoreFormer);

ALTER TABLE "_PREFIX_logins"
    ADD COLUMN "nonce" VARCHAR(96) NULL DEFAULT NULL;
CREATE UNIQUE INDEX nonce_index ON logins(nonce);