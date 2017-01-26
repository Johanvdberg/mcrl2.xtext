/**
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.mclrDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tuks.mcrl2.dsl.mclrDsl.EqnDecl;
import tuks.mcrl2.dsl.mclrDsl.EqnSpec;
import tuks.mcrl2.dsl.mclrDsl.MclrDslPackage;
import tuks.mcrl2.dsl.mclrDsl.VarSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eqn Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.EqnSpecImpl#getSpec <em>Spec</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.EqnSpecImpl#getEqn <em>Eqn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EqnSpecImpl extends MinimalEObjectImpl.Container implements EqnSpec
{
  /**
   * The cached value of the '{@link #getSpec() <em>Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpec()
   * @generated
   * @ordered
   */
  protected VarSpec spec;

  /**
   * The cached value of the '{@link #getEqn() <em>Eqn</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEqn()
   * @generated
   * @ordered
   */
  protected EList<EqnDecl> eqn;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EqnSpecImpl()
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
    return MclrDslPackage.Literals.EQN_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarSpec getSpec()
  {
    return spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpec(VarSpec newSpec, NotificationChain msgs)
  {
    VarSpec oldSpec = spec;
    spec = newSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclrDslPackage.EQN_SPEC__SPEC, oldSpec, newSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpec(VarSpec newSpec)
  {
    if (newSpec != spec)
    {
      NotificationChain msgs = null;
      if (spec != null)
        msgs = ((InternalEObject)spec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.EQN_SPEC__SPEC, null, msgs);
      if (newSpec != null)
        msgs = ((InternalEObject)newSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.EQN_SPEC__SPEC, null, msgs);
      msgs = basicSetSpec(newSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclrDslPackage.EQN_SPEC__SPEC, newSpec, newSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EqnDecl> getEqn()
  {
    if (eqn == null)
    {
      eqn = new EObjectContainmentEList<EqnDecl>(EqnDecl.class, this, MclrDslPackage.EQN_SPEC__EQN);
    }
    return eqn;
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
      case MclrDslPackage.EQN_SPEC__SPEC:
        return basicSetSpec(null, msgs);
      case MclrDslPackage.EQN_SPEC__EQN:
        return ((InternalEList<?>)getEqn()).basicRemove(otherEnd, msgs);
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
      case MclrDslPackage.EQN_SPEC__SPEC:
        return getSpec();
      case MclrDslPackage.EQN_SPEC__EQN:
        return getEqn();
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
      case MclrDslPackage.EQN_SPEC__SPEC:
        setSpec((VarSpec)newValue);
        return;
      case MclrDslPackage.EQN_SPEC__EQN:
        getEqn().clear();
        getEqn().addAll((Collection<? extends EqnDecl>)newValue);
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
      case MclrDslPackage.EQN_SPEC__SPEC:
        setSpec((VarSpec)null);
        return;
      case MclrDslPackage.EQN_SPEC__EQN:
        getEqn().clear();
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
      case MclrDslPackage.EQN_SPEC__SPEC:
        return spec != null;
      case MclrDslPackage.EQN_SPEC__EQN:
        return eqn != null && !eqn.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EqnSpecImpl