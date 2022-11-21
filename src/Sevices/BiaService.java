/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevices;

import DomainModels.Bia;
import Repositories.BiaRepository;
import Repositories.IBiaRepository;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class BiaService implements IBiaService{
    
    private final IBiaRepository _iBiaRepository;
    private ArrayList<Bia> _lstBia;

    public BiaService() {
        _iBiaRepository = new BiaRepository();
        _lstBia = new ArrayList<>();
    }
    
    @Override
    public ArrayList<Bia> findAll() {
         return _iBiaRepository.findAll();
    }
    
}
