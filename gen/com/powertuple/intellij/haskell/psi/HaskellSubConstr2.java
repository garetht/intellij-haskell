// This is a generated file. Not intended for manual editing.
package com.powertuple.intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellSubConstr2 extends HaskellCompositeElement {

  @NotNull
  List<HaskellGtycon> getGtyconList();

  @NotNull
  List<HaskellQvar> getQvarList();

  @NotNull
  List<HaskellQvarOp> getQvarOpList();

  @NotNull
  List<HaskellTtype> getTtypeList();

  @NotNull
  List<HaskellTypeSignatureDeclaration> getTypeSignatureDeclarationList();

}
