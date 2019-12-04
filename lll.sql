
select * from impuesto;
select * from contribuyente;
select * from impuestos_contribuyente; 

select  c.claveFiscal ,i.nombre
from contribuyente c
inner join contribuyente_impuesto ci on ci.idcontribuyente = c.idcontribuyente
inner join impuesto i on i.idimpuestos = ci.idimpuestos;

select  c.claveFiscal ,i.nombre
from contribuyente c
inner join impuestos_contribuyente ci on ci.idcontribuyente = c.idcontribuyente
inner join impuesto i on i.idimpuestos = ci.idimpuestos;