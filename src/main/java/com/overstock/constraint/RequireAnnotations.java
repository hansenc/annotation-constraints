package com.overstock.constraint;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Requires that annotated types have specific annotations.
 */
@Documented
@Constraint
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.ANNOTATION_TYPE)
public @interface RequireAnnotations {

  /**
   * An array of annotations which MUST be present on any class annotated with the target annotation.
   *
   * For example, if {@code SomeAnnotation} is annotated with {@code RequireAnnotations(OtherAnnotation.class)},
   * then it will be an error whenever a class annotated with {@code @SomeAnnotation} is not also annotated with
   * {@code @OtherAnnotation}.
   */
  Class<? extends Annotation>[] value();

}
