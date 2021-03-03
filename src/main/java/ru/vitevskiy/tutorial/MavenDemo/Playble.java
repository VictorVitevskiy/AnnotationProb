package ru.vitevskiy.tutorial.MavenDemo;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //
@Target(ElementType.METHOD) // к чему прикрепляем
public @interface Playble {
}
