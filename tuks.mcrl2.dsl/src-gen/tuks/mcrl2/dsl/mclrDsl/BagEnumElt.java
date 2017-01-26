/**
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.mclrDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bag Enum Elt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.BagEnumElt#getLeft <em>Left</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.BagEnumElt#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getBagEnumElt()
 * @model
 * @generated
 */
public interface BagEnumElt extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(DataExpr)
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getBagEnumElt_Left()
   * @model containment="true"
   * @generated
   */
  DataExpr getLeft();

  /**
   * Sets the value of the '{@link tuks.mcrl2.dsl.mclrDsl.BagEnumElt#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(DataExpr value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(DataExpr)
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getBagEnumElt_Right()
   * @model containment="true"
   * @generated
   */
  DataExpr getRight();

  /**
   * Sets the value of the '{@link tuks.mcrl2.dsl.mclrDsl.BagEnumElt#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(DataExpr value);

} // BagEnumElt