# Djed Tx Indexer

## PSQL

Init local dev psql db

`createuser --superuser postgres`

`psql -U postgres`

Then create db:

```
CREATE USER djed PASSWORD 'password';

CREATE DATABASE djed WITH OWNER djed;
```


