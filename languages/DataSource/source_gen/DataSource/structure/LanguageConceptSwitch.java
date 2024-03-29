package DataSource.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Attribute = 0;
  public static final int Entity = 1;
  public static final int EntityList = 2;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xbe5be3d615724d96L, 0x87fbb6ad07c44926L);
    builder.put(0x2a3d62b653db628fL, Attribute);
    builder.put(0x2a3d62b653db75ceL, Entity);
    builder.put(0x1dd0f33f1151473L, EntityList);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
