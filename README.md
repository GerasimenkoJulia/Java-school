Java-school
===========

Logiweb
Всего 6 сущностей. для основных (водители, заказы, фуры, позиции в заказах) в качестве первичного ключа - авто инкременти-
руемое поле.
В таблицу "Orders" добавила поля: cost (расчет для нас не важен, онведется где-то вне, в поле вписывается итоговая сумма),
также для клиента желательная дата доставки delivery_date.
Поле "delivery_status" таблицы "Order items" по дефолту отрицательно
Добавила новую таблицу "Orders_statuses" , как мне кажется, это очень важно, чтоб всегда, в любой моент времени было видно
на каком этапе сейчас какой заказ и в какое время заказ проходил определенные этапы...то есть сводка о всех заказах , как и
во сколько все осуществлялось.