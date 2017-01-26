/**
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.mclrDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tuks.mcrl2.dsl.mclrDsl.MapSpec;
import tuks.mcrl2.dsl.mclrDsl.MclrDslPackage;
import tuks.mcrl2.dsl.mclrDsl.SortIdsDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.MapSpecImpl#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapSpecImpl extends MinimalEObjectImpl.Container implements MapSpec
{
  /**
   * The cached value of the '{@link #getIds() <em>Ids</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIds()
   * @generated
   * @ordered
   */
  protected EList<SortIdsDecl> ids;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapSpecImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MclrDslPackage.Literals.MAP_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SortIdsDecl> getIds()
  {
    if (ids == null)
    {
      ids = new EObjectContainmentEList<SortIdsDecl>(SortIdsDecl.class, this, MclrDslPackage.MAP_SPEC__IDS);
    }
    return ids;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MclrDslPackage.MAP_SPEC__IDS:
        return ((InternalEList<?>)getIds()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MclrDslPackage.MAP_SPEC__IDS:
        return getIds();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MclrDslPackage.MAP_SPEC__IDS:
        getIds().clear();
        getIds().addAll((Collection<? extends SortIdsDecl>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MclrDslPackage.MAP_SPEC__IDS:
        getIds().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MclrDslPackage.MAP_SPEC__IDS:
        return ids != null && !ids.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MapSpecImpl