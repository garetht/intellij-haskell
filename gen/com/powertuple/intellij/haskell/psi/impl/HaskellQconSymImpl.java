// This is a generated file. Not intended for manual editing.
package com.powertuple.intellij.haskell.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.powertuple.intellij.haskell.psi.HaskellTypes.*;
import com.powertuple.intellij.haskell.psi.*;

public class HaskellQconSymImpl extends HaskellCompositeElementImpl implements HaskellQconSym {

  public HaskellQconSymImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) ((HaskellVisitor)visitor).visitQconSym(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HaskellConSym getConSym() {
    return findNotNullChildByClass(HaskellConSym.class);
  }

  @Override
  @NotNull
  public HaskellQualifier getQualifier() {
    return findNotNullChildByClass(HaskellQualifier.class);
  }

}
