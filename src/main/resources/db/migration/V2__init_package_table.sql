create table packages(
  trackingNumber VARCHAR (64) primary key not null ,
  addressee VARCHAR (64) not null,
  telephone VARCHAR (64) not null,
  weight VARCHAR (64) not null,
  state VARCHAR (64) not null,
  dateTime VARCHAR (64)
)