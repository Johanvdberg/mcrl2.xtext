/**
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.mclrDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Ids Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.SortIdsDecl#getId <em>Id</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.SortIdsDecl#getSort <em>Sort</em>}</li>
 * </ul>
 *
 * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getSortIdsDecl()
 * @model
 * @generated
 */
public interface SortIdsDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(SortIdList)
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getSortIdsDecl_Id()
   * @model containment="true"
   * @generated
   */
  SortIdList getId();

  /**
   * Sets the value of the '{@link tuks.mcrl2.dsl.mclrDsl.SortIdsDecl#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(SortIdList value);

  /**
   * Returns the value of the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort</em>' containment reference.
   * @see #setSort(SortExpr)
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getSortIdsDecl_Sort()
   * @model containment="true"
   * @generated
   */
  SortExpr getSort();

  /**
   * Sets the value of the '{@link tuks.mcrl2.dsl.mclrDsl.SortIdsDecl#getSort <em>Sort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort</em>' containment reference.
   * @see #getSort()
   * @generated
   */
  void setSort(SortExpr value);

} // SortIdsDecl
