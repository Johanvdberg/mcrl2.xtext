/**
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.mclrDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cons Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.ConsSpec#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getConsSpec()
 * @model
 * @generated
 */
public interface ConsSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Ids</b></em>' containment reference list.
   * The list contents are of type {@link tuks.mcrl2.dsl.mclrDsl.ConstrName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ids</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ids</em>' containment reference list.
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getConsSpec_Ids()
   * @model containment="true"
   * @generated
   */
  EList<ConstrName> getIds();

} // ConsSpec
