package companionannotations;

import noconstraints.Unconstrained;
import requireconstructors.RequireNoArgConstructor;

import java.lang.annotation.Inherited;

import com.overstock.constraint.TargetShouldBeAnnotatedWith;

@Inherited
@TargetShouldBeAnnotatedWith({Unconstrained.class, RequireNoArgConstructor.class})
public @interface RecommendMultiple {
}
