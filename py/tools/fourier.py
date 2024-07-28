import numpy as np
import matplotlib.pyplot as plt

sampling_rate = 1000
duration = 2

# Time vector
t = np.linspace(0, duration, int(sampling_rate*duration), endpoint=False)

# A composite wave of 50Hz and 100Hz
frequency1 = 50
frequency2 = 100
amplitude1 = 1
amplitude2 = 0.5

# The signal vector
signal = amplitude1 * np.sin(2 * np.pi * frequency1 * t) + \
    amplitude2 * np.sin(2 * np.pi * frequency2 * t)

fourier_transform = np.fft.fft(signal)
frequencies = np.fft.fftfreq(len(fourier_transform), 1/sampling_rate)

plt.figure(figsize=(12, 6))

# Plotting the signal
plt.subplot(2, 1, 1)
plt.plot(t, signal)
plt.title('Original Signal')
plt.xlabel('Time (s)')
plt.ylabel('Amplitude')

# Plotting the spectrum
plt.subplot(2, 1, 2)
plt.plot(frequencies, np.abs(fourier_transform))
plt.title('Frequency Spectrum')
plt.xlabel('Frequency (Hz)')
plt.ylabel('Amplitude')

#
plt.xlim(0, 150)
plt.tight_layout()
plt.show()
