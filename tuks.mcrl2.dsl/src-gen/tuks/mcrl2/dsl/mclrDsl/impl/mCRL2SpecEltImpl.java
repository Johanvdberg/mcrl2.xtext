/**
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.mclrDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tuks.mcrl2.dsl.mclrDsl.ActSpec;
import tuks.mcrl2.dsl.mclrDsl.ConsSpec;
import tuks.mcrl2.dsl.mclrDsl.EqnSpec;
import tuks.mcrl2.dsl.mclrDsl.GlobVarSpec;
import tuks.mcrl2.dsl.mclrDsl.MapSpec;
import tuks.mcrl2.dsl.mclrDsl.MclrDslPackage;
import tuks.mcrl2.dsl.mclrDsl.ProcSpec;
import tuks.mcrl2.dsl.mclrDsl.SortSpec;
import tuks.mcrl2.dsl.mclrDsl.mCRL2SpecElt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>mCRL2 Spec Elt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.mCRL2SpecEltImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.mCRL2SpecEltImpl#getConst <em>Const</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.mCRL2SpecEltImpl#getMap <em>Map</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.mCRL2SpecEltImpl#getEqn <em>Eqn</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.mCRL2SpecEltImpl#getBlobal <em>Blobal</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.mCRL2SpecEltImpl#getAct <em>Act</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.mCRL2SpecEltImpl#getProc <em>Proc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class mCRL2SpecEltImpl extends MinimalEObjectImpl.Container implements mCRL2SpecElt
{
  /**
   * The cached value of the '{@link #getSort() <em>Sort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSort()
   * @generated
   * @ordered
   */
  protected SortSpec sort;

  /**
   * The cached value of the '{@link #getConst() <em>Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConst()
   * @generated
   * @ordered
   */
  protected ConsSpec const_;

  /**
   * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMap()
   * @generated
   * @ordered
   */
  protected MapSpec map;

  /**
   * The cached value of the '{@link #getEqn() <em>Eqn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEqn()
   * @generated
   * @ordered
   */
  protected EqnSpec eqn;

  /**
   * The cached value of the '{@link #getBlobal() <em>Blobal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlobal()
   * @generated
   * @ordered
   */
  protected GlobVarSpec blobal;

  /**
   * The cached value of the '{@link #getAct() <em>Act</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAct()
   * @generated
   * @ordered
   */
  protected ActSpec act;

  /**
   * The cached value of the '{@link #getProc() <em>Proc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProc()
   * @generated
   * @ordered
   */
  protected ProcSpec proc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected mCRL2SpecEltImpl()
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
    return MclrDslPackage.Literals.MCRL2_SPEC_ELT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortSpec getSort()
  {
    return sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSort(SortSpec newSort, NotificationChain msgs)
  {
    SortSpec oldSort = sort;
    sort = newSort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclrDslPackage.MCRL2_SPEC_ELT__SORT, oldSort, newSort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSort(SortSpec newSort)
  {
    if (newSort != sort)
    {
      NotificationChain msgs = null;
      if (sort != null)
        msgs = ((InternalEObject)sort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.MCRL2_SPEC_ELT__SORT, null, msgs);
      if (newSort != null)
        msgs = ((InternalEObject)newSort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.MCRL2_SPEC_ELT__SORT, null, msgs);
      msgs = basicSetSort(newSort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclrDslPackage.MCRL2_SPEC_ELT__SORT, newSort, newSort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConsSpec getConst()
  {
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConst(ConsSpec newConst, NotificationChain msgs)
  {
    ConsSpec oldConst = const_;
    const_ = newConst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclrDslPackage.MCRL2_SPEC_ELT__CONST, oldConst, newConst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConst(ConsSpec newConst)
  {
    if (newConst != const_)
    {
      NotificationChain msgs = null;
      if (const_ != null)
        msgs = ((InternalEObject)const_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.MCRL2_SPEC_ELT__CONST, null, msgs);
      if (newConst != null)
        msgs = ((InternalEObject)newConst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.MCRL2_SPEC_ELT__CONST, null, msgs);
      msgs = basicSetConst(newConst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclrDslPackage.MCRL2_SPEC_ELT__CONST, newConst, newConst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapSpec getMap()
  {
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMap(MapSpec newMap, NotificationChain msgs)
  {
    MapSpec oldMap = map;
    map = newMap;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclrDslPackage.MCRL2_SPEC_ELT__MAP, oldMap, newMap);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMap(MapSpec newMap)
  {
    if (newMap != map)
    {
      NotificationChain msgs = null;
      if (map != null)
        msgs = ((InternalEObject)map).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.MCRL2_SPEC_ELT__MAP, null, msgs);
      if (newMap != null)
        msgs = ((InternalEObject)newMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.MCRL2_SPEC_ELT__MAP, null, msgs);
      msgs = basicSetMap(newMap, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclrDslPackage.MCRL2_SPEC_ELT__MAP, newMap, newMap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqnSpec getEqn()
  {
    return eqn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEqn(EqnSpec newEqn, NotificationChain msgs)
  {
    EqnSpec oldEqn = eqn;
    eqn = newEqn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclrDslPackage.MCRL2_SPEC_ELT__EQN, oldEqn, newEqn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEqn(EqnSpec newEqn)
  {
    if (newEqn != eqn)
    {
      NotificationChain msgs = null;
      if (eqn != null)
        msgs = ((InternalEObject)eqn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.MCRL2_SPEC_ELT__EQN, null, msgs);
      if (newEqn != null)
        msgs = ((InternalEObject)newEqn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.MCRL2_SPEC_ELT__EQN, null, msgs);
      msgs = basicSetEqn(newEqn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclrDslPackage.MCRL2_SPEC_ELT__EQN, newEqn, newEqn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobVarSpec getBlobal()
  {
    return blobal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlobal(GlobVarSpec newBlobal, NotificationChain msgs)
  {
    GlobVarSpec oldBlobal = blobal;
    blobal = newBlobal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclrDslPackage.MCRL2_SPEC_ELT__BLOBAL, oldBlobal, newBlobal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlobal(GlobVarSpec newBlobal)
  {
    if (newBlobal != blobal)
    {
      NotificationChain msgs = null;
      if (blobal != null)
        msgs = ((InternalEObject)blobal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.MCRL2_SPEC_ELT__BLOBAL, null, msgs);
      if (newBlobal != null)
        msgs = ((InternalEObject)newBlobal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.MCRL2_SPEC_ELT__BLOBAL, null, msgs);
      msgs = basicSetBlobal(newBlobal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclrDslPackage.MCRL2_SPEC_ELT__BLOBAL, newBlobal, newBlobal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActSpec getAct()
  {
    return act;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAct(ActSpec newAct, NotificationChain msgs)
  {
    ActSpec oldAct = act;
    act = newAct;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclrDslPackage.MCRL2_SPEC_ELT__ACT, oldAct, newAct);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAct(ActSpec newAct)
  {
    if (newAct != act)
    {
      NotificationChain msgs = null;
      if (act != null)
        msgs = ((InternalEObject)act).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.MCRL2_SPEC_ELT__ACT, null, msgs);
      if (newAct != null)
        msgs = ((InternalEObject)newAct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.MCRL2_SPEC_ELT__ACT, null, msgs);
      msgs = basicSetAct(newAct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclrDslPackage.MCRL2_SPEC_ELT__ACT, newAct, newAct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcSpec getProc()
  {
    return proc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProc(ProcSpec newProc, NotificationChain msgs)
  {
    ProcSpec oldProc = proc;
    proc = newProc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclrDslPackage.MCRL2_SPEC_ELT__PROC, oldProc, newProc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProc(ProcSpec newProc)
  {
    if (newProc != proc)
    {
      NotificationChain msgs = null;
      if (proc != null)
        msgs = ((InternalEObject)proc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.MCRL2_SPEC_ELT__PROC, null, msgs);
      if (newProc != null)
        msgs = ((InternalEObject)newProc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.MCRL2_SPEC_ELT__PROC, null, msgs);
      msgs = basicSetProc(newProc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclrDslPackage.MCRL2_SPEC_ELT__PROC, newProc, newProc));
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
      case MclrDslPackage.MCRL2_SPEC_ELT__SORT:
        return basicSetSort(null, msgs);
      case MclrDslPackage.MCRL2_SPEC_ELT__CONST:
        return basicSetConst(null, msgs);
      case MclrDslPackage.MCRL2_SPEC_ELT__MAP:
        return basicSetMap(null, msgs);
      case MclrDslPackage.MCRL2_SPEC_ELT__EQN:
        return basicSetEqn(null, msgs);
      case MclrDslPackage.MCRL2_SPEC_ELT__BLOBAL:
        return basicSetBlobal(null, msgs);
      case MclrDslPackage.MCRL2_SPEC_ELT__ACT:
        return basicSetAct(null, msgs);
      case MclrDslPackage.MCRL2_SPEC_ELT__PROC:
        return basicSetProc(null, msgs);
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
      case MclrDslPackage.MCRL2_SPEC_ELT__SORT:
        return getSort();
      case MclrDslPackage.MCRL2_SPEC_ELT__CONST:
        return getConst();
      case MclrDslPackage.MCRL2_SPEC_ELT__MAP:
        return getMap();
      case MclrDslPackage.MCRL2_SPEC_ELT__EQN:
        return getEqn();
      case MclrDslPackage.MCRL2_SPEC_ELT__BLOBAL:
        return getBlobal();
      case MclrDslPackage.MCRL2_SPEC_ELT__ACT:
        return getAct();
      case MclrDslPackage.MCRL2_SPEC_ELT__PROC:
        return getProc();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MclrDslPackage.MCRL2_SPEC_ELT__SORT:
        setSort((SortSpec)newValue);
        return;
      case MclrDslPackage.MCRL2_SPEC_ELT__CONST:
        setConst((ConsSpec)newValue);
        return;
      case MclrDslPackage.MCRL2_SPEC_ELT__MAP:
        setMap((MapSpec)newValue);
        return;
      case MclrDslPackage.MCRL2_SPEC_ELT__EQN:
        setEqn((EqnSpec)newValue);
        return;
      case MclrDslPackage.MCRL2_SPEC_ELT__BLOBAL:
        setBlobal((GlobVarSpec)newValue);
        return;
      case MclrDslPackage.MCRL2_SPEC_ELT__ACT:
        setAct((ActSpec)newValue);
        return;
      case MclrDslPackage.MCRL2_SPEC_ELT__PROC:
        setProc((ProcSpec)newValue);
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
      case MclrDslPackage.MCRL2_SPEC_ELT__SORT:
        setSort((SortSpec)null);
        return;
      case MclrDslPackage.MCRL2_SPEC_ELT__CONST:
        setConst((ConsSpec)null);
        return;
      case MclrDslPackage.MCRL2_SPEC_ELT__MAP:
        setMap((MapSpec)null);
        return;
      case MclrDslPackage.MCRL2_SPEC_ELT__EQN:
        setEqn((EqnSpec)null);
        return;
      case MclrDslPackage.MCRL2_SPEC_ELT__BLOBAL:
        setBlobal((GlobVarSpec)null);
        return;
      case MclrDslPackage.MCRL2_SPEC_ELT__ACT:
        setAct((ActSpec)null);
        return;
      case MclrDslPackage.MCRL2_SPEC_ELT__PROC:
        setProc((ProcSpec)null);
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
      case MclrDslPackage.MCRL2_SPEC_ELT__SORT:
        return sort != null;
      case MclrDslPackage.MCRL2_SPEC_ELT__CONST:
        return const_ != null;
      case MclrDslPackage.MCRL2_SPEC_ELT__MAP:
        return map != null;
      case MclrDslPackage.MCRL2_SPEC_ELT__EQN:
        return eqn != null;
      case MclrDslPackage.MCRL2_SPEC_ELT__BLOBAL:
        return blobal != null;
      case MclrDslPackage.MCRL2_SPEC_ELT__ACT:
        return act != null;
      case MclrDslPackage.MCRL2_SPEC_ELT__PROC:
        return proc != null;
    }
    return super.eIsSet(featureID);
  }

} //mCRL2SpecEltImpl