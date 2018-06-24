insert into member(id, login_id, password, name, reg_date, mod_date)
values( null, 'yeirpark', '1234', '박예리',now(), now());

insert into category(id, code, category_name, reg_date, mod_date)
values( null, '10001', 'starbucks', now(), now());
insert into category(id, code, category_name, reg_date, mod_date)
values( null, '10002', 'coffee bean', now(), now());
insert into category(id, code, category_name, reg_date, mod_date)
values( null, '10003', 'hollys', now(), now());

insert into item(id, item_name, category_id, price, reg_date, mod_date)
values( null, '아메리카노', '10001', 4500, now(), now());
insert into item(id, item_name, category_id, price, reg_date, mod_date)
values( null, '아이스아메리카노', '10001', 4500, now(), now());
insert into item(id, item_name, category_id, price, reg_date, mod_date)
values( null, '까페라떼', '10001', 5000, now(), now());
insert into item(id, item_name, category_id, price, reg_date, mod_date)
values( null, '아이스까페라떼', '10001', 5000, now(), now());

