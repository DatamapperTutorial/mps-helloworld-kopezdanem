package DataMapping.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.HashMap;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SProperty;

public class AttributePairRef_Constraints extends BaseConstraintsDescriptor {
  public AttributePairRef_Constraints() {
    super(CONCEPTS.AttributePairRef$RE);
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    BaseReferenceConstraintsDescriptor d0 = new BaseReferenceConstraintsDescriptor(LINKS.entity$vHXQ, this, true, false) {
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return ReferenceScopeProvider.fromHierarchy(CONCEPTS.SourceEntityRef$pM, new SNodePointer("r:ca12430d-bb8b-4b60-b669-303893ccb47b(DataMapping.constraints)", "4417412243803064147"));
      }
    };
    BaseReferenceConstraintsDescriptor d1 = new BaseReferenceConstraintsDescriptor(LINKS.rangeStart$vIcR, this, true, false) {
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return new SNodePointer("r:ca12430d-bb8b-4b60-b669-303893ccb47b(DataMapping.constraints)", "4417412243803171786");
          }
          @Override
          public Scope createScope(final ReferenceConstraintsContext _context) {
            List<SNode> attributes = SLinkOperations.getChildren(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(_context.getContextNode(), CONCEPTS.AttributePairRef$RE), LINKS.entity$vHXQ), LINKS.entity$bFOA), LINKS.attributes$4PUI);
            return new ListScope(attributes) {
              @Override
              public String getName(SNode child) {
                return SPropertyOperations.getString(SNodeOperations.cast(child, CONCEPTS.Attribute$nJ), PROPS.name$MnvL);
              }
            };
          }
        };
      }
    };
    BaseReferenceConstraintsDescriptor d2 = new BaseReferenceConstraintsDescriptor(LINKS.rangeEnd$cPCW, this, true, false) {
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return new SNodePointer("r:ca12430d-bb8b-4b60-b669-303893ccb47b(DataMapping.constraints)", "4417412243803182158");
          }
          @Override
          public Scope createScope(final ReferenceConstraintsContext _context) {
            List<SNode> attributes = SLinkOperations.getChildren(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(_context.getContextNode(), CONCEPTS.AttributePairRef$RE), LINKS.entity$vHXQ), LINKS.entity$bFOA), LINKS.attributes$4PUI);
            return new ListScope(attributes) {
              @Override
              public String getName(SNode child) {
                return SPropertyOperations.getString(SNodeOperations.cast(child, CONCEPTS.Attribute$nJ), PROPS.name$MnvL);
              }
            };
          }
        };
      }
    };
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(d0.getReference(), d0);
    references.put(d1.getReference(), d1);
    references.put(d2.getReference(), d2);
    return references;
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept AttributePairRef$RE = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x3d4dcd080255f3adL, "DataMapping.structure.AttributePairRef");
    /*package*/ static final SConcept SourceEntityRef$pM = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x28099d21881b7c6eL, "DataMapping.structure.SourceEntityRef");
    /*package*/ static final SConcept Attribute$nJ = MetaAdapterFactory.getConcept(0xbe5be3d615724d96L, 0x87fbb6ad07c44926L, 0x2a3d62b653db628fL, "DataSource.structure.Attribute");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink entity$vHXQ = MetaAdapterFactory.getReferenceLink(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x3d4dcd080255f3adL, 0x3d4dcd080255f9c6L, "entity");
    /*package*/ static final SReferenceLink rangeStart$vIcR = MetaAdapterFactory.getReferenceLink(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x3d4dcd080255f3adL, 0x3d4dcd080255f9c7L, "rangeStart");
    /*package*/ static final SReferenceLink entity$bFOA = MetaAdapterFactory.getReferenceLink(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x28099d21881b7c6eL, 0x1e39116e79aef80aL, "entity");
    /*package*/ static final SContainmentLink attributes$4PUI = MetaAdapterFactory.getContainmentLink(0xbe5be3d615724d96L, 0x87fbb6ad07c44926L, 0x2a3d62b653db75ceL, 0x2a3d62b653db8592L, "attributes");
    /*package*/ static final SReferenceLink rangeEnd$cPCW = MetaAdapterFactory.getReferenceLink(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x3d4dcd080255f3adL, 0x3d4dcd080255fdaaL, "rangeEnd");
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
  }
}
