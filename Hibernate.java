package com. inventory.stil;

import org.hibernate.Sessionfactory;

public class thermata11 (

private static SessionFactory factoгу;

static (

factory new Configuration().configure().buildSessionFactory();

public static SessionFactory getsesstonFactory() (

return factory:
